package cn.ck.iterate;


import java.util.Arrays;

/**
 * ��ģ��һ��ArrayList,��дһ��get add ���� ����ۼ���
 * @param <E>����E
 */
public class MyArrayList<E> implements MyCollection<E> {
    int size;
    Object [] elements;
    int capacity;

    public MyArrayList(int capacity) {
        if(capacity<0){
            throw new RuntimeException("ArrayList�������������0");
        } else if(capacity==0){
            elements=new Object[]{};
        } else{
            this.capacity = capacity;
            elements=new Object[10];
        }

    }

    public MyArrayList() {
        this(10);
    }
    //add����
    public boolean add(E e){
        if(size>=capacity){
            int newCapacity=capacity+capacity>>1;
            Arrays.copyOf(elements,newCapacity);
        }
        elements[size++]=e;
        return true;
    }
    //get����
    public E get(int index){
        if(index>size||index<0){
            throw new RuntimeException("�����±�Խ��");
        }
        return (E) elements[index];
    }
    //size����
    public int size(){
        return size;
    }
    @Override
    public Iterator<E> iterate() {
        return new MyArrayListIterator();
    }
    //�����������
    private class MyArrayListIterator<E> implements Iterator<E> {
        int cursor=0;
        @Override
        public boolean hasNext() {
            if(cursor<size){
                return true;
            }
            return false;
        }

        @Override
        public E next() {
            E e= (E) elements[cursor];
            cursor++;
            return e;

        }
    }
}

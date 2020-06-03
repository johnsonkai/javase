package cn.ck.iterate;


import java.util.Arrays;

/**
 * 简单模拟一下ArrayList,简单写一个get add 方法 具体聚集类
 * @param <E>泛型E
 */
public class MyArrayList<E> implements MyCollection<E> {
    int size;
    Object [] elements;
    int capacity;

    public MyArrayList(int capacity) {
        if(capacity<0){
            throw new RuntimeException("ArrayList的容量必须大于0");
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
    //add方法
    public boolean add(E e){
        if(size>=capacity){
            int newCapacity=capacity+capacity>>1;
            Arrays.copyOf(elements,newCapacity);
        }
        elements[size++]=e;
        return true;
    }
    //get方法
    public E get(int index){
        if(index>size||index<0){
            throw new RuntimeException("数组下标越界");
        }
        return (E) elements[index];
    }
    //size方法
    public int size(){
        return size;
    }
    @Override
    public Iterator<E> iterate() {
        return new MyArrayListIterator();
    }
    //具体迭代器类
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

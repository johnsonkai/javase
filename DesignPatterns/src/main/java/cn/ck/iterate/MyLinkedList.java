package cn.ck.iterate;

/**
 * 为了模拟迭代器模式，自定义LInkedList的add方法,add方法
 */
public class MyLinkedList<E> implements MyCollection<E> {
    private Node<E> first;
    private Node<E> last ;
    int size;

    //add方法
    public boolean add(E e){
        Node<E> n =last;
        Node<E> newNode=new Node<E>(last,null,e);
        last=newNode;
        if(first==null){
            first=newNode;
        }else{
            n.next=newNode;
        }
        size++;
        return true;
    }
    //size方法
    public int size(){
        return size;
    }
    //get方法
    public E get(int index){
       return getNode(index).value;
    }
    //通过下标获取相关的Node节点
    Node<E> getNode(int index){
        if(index>size||index<0){
            throw new RuntimeException("LinkedList下标越界了");
        }
        if(index<(size>>1)){
            Node<E> n= first;
            for(int i=0;i<index;i++){
                n=n.next;
            }
            return n;
        } else{
            Node<E> n= last;
            for (int j=size;j>index;j--){
                n=n.pre;
            }
            return n;
        }

    }
    public MyLinkedList() {

    }

    @Override
    public Iterator<E> iterate() {
        return new LinkedListIterator<>(0);
    }
    private static class Node<E> {
        Node pre;
        Node next;
        E value;

        public Node(Node pre, Node next, E value) {
            this.pre = pre;
            this.next = next;
            this.value = value;
        }
    }
    private class LinkedListIterator<E> implements Iterator<E>{
        public LinkedListIterator(int cursor) {
            this.cursor = cursor;
            currentNode= (Node<E>) getNode(cursor);
        }

        private int cursor;
        Node<E> currentNode;
        @Override
        public boolean hasNext() {
            if(cursor<size){
                return true;
            }
            return false;
        }

        @Override
        public E next() {
            E e =currentNode.value;
            currentNode=currentNode.next;
            cursor++;
            return e;
        }
    }
}

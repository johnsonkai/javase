package cn.ck.iterate;

/**
 * Ϊ��ģ�������ģʽ���Զ���LInkedList��add����,add����
 */
public class MyLinkedList<E> implements MyCollection<E> {
    private Node<E> first;
    private Node<E> last ;
    int size;

    //add����
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
    //size����
    public int size(){
        return size;
    }
    //get����
    public E get(int index){
       return getNode(index).value;
    }
    //ͨ���±��ȡ��ص�Node�ڵ�
    Node<E> getNode(int index){
        if(index>size||index<0){
            throw new RuntimeException("LinkedList�±�Խ����");
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

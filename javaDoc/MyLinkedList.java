package cn.com.List;

import java.util.LinkedList;

public class MyLinkedList<T> {
	private int size=0;
	private Node<T> first;
	private Node<T>  last;
	public void addFirst(T obj){
		if(first==null){
			Node<T> node =new Node(obj, null, null);
			first=node;
			last=node;
			
		}	else{
			Node<T> node =new Node(obj, null, first);
			first.pre=node;
			first=node;
			
		}
		size++;
	}
	public void addLast(T obj){
		if(first==null){
			Node<T> node =new Node(obj, null, null);
			first=node;
			last=node;
			
		}	else{
			Node<T> node =new Node(obj, last, null);
			last.next=node;
			last=node;
			
		}
		size++;
	}
	public void add(T obj,int index){
		if(index>size){
			throw new IndexOutOfBoundsException("linkedlisted集合下表越界");
		}
		Node<T> temp = getNode(index);
		
		
		
		if(temp!=null){
			if(index==0){
				addFirst(obj);
				return;
			}
			if(index==size-1){
				Node<T> before=temp.pre;
				Node<T> newNode= new Node<T>(obj, before, temp);
				before.next=newNode;
				temp.pre=newNode;
				last=temp;
				size++;
			}	else{
				Node<T> after=temp.next;
				Node<T> newNode= new Node<T>(obj, temp, after);
				
				after.pre=newNode;
				temp.next=newNode;
				size++;
			}
		
		

		}
			 
	}
	public boolean add(T obj){
		boolean bool =false;
		if(first==null){
			Node<T> node =new Node(obj, null, null);
			first=node;
			last=node;
			
		}	else{
			Node<T> node =new Node(obj, last, null);
			last.next=node;
			last=node;
		}
		size++;
		bool =true;
		return bool;
	}
	public int size(){
		return size;
	}
	public boolean isEmpty(){
		if(size==0&&last==null&&first==null){
			return true;
		}
		return false;
	}
	public T removeFirst(){
		T result=null;
		if(first!=null){
			result=first.element;
			if(size==1){
				first=null;
			}	else{
				Node<T> temp=first.next;
				temp.pre=null;
			
				first=temp;
			}
			size--;
			
		}
		return result;
		
		
	}
	public T removeLast(){
		T result=null;
		if(last!=null){
			result=last.element;
			if(size==1){
				last=null;
			}	else{
				Node<T> temp = last.pre;
				temp.next=null;
				last=temp;
			}
			size--;
		}
		return result;
	}
	public boolean remove(Object obj){
		boolean bool=false;
		for (int i = 0; i < size; i++) {
			if(getNode(i).element.equals(obj)){
				remove(i);
				bool=true;
			}
		}
		return bool;
	}
	public void clear(){
		for (int i = 0; i < size; i++) {
			Node<T> temp=getNode(i);
			temp.element=null;
			temp.next=null;
			temp.pre=null;
			
		}
		size=0;
	}
	public T remove(int index){
		if(index==0){
			return removeFirst();
		}
		if(size-1==index){
			return removeLast();
		}
		Node<T> temp =getNode(index);
		if(temp!=null){
			Node<T> up=temp.pre;
			Node<T> down=temp.next;
			up.next=down;
			down.pre=up;
			size--;
		}
		return (T) temp.element;
	}
	public T get(int index){
		if(index>=size){
			throw new IndexOutOfBoundsException("集合下标越界");
		}
		if(first!=null){
			Node temp=getNode(index);
			return (T) temp.element;
		}
		
		return null;
	}
	public Node getNode(int index){
		Node temp =null;
		if(first!=null){
			temp=first;
			for (int i = 0; i < index; i++) {
				temp=temp.next;
			}
		}
		return temp;
		
	}
	private static class Node<T>{
		private T element;
		private Node<T> pre;
		private Node<T> next;
		
		public T getElement() {
			return element;
		}

		public void setElement(T element) {
			this.element = element;
		}

		public Node getPre() {
			return pre;
		}

		public void setPre(Node pre) {
			this.pre = pre;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public Node(T element,Node pre,Node next){
			this.element=element;
			this.pre=pre;
			this.next=next;
		}
	}
	public static void main(String[] args) {
		MyLinkedList<Student> s = new MyLinkedList<Student>();
		s.add(new Student(3,"jack"));
	
		//s.addFirst(new Student(4,"jackr"));
		//s.add(new Student(8,"jackrf"),0);
		
		
		System.out.println(s.remove(0));
		//System.out.println(s.get());
		
	}
}

package cn.com.List;

public class SingleLinkedListed<T> {
	//跟linkedList差不多
	private int size;
	private Node<T> header;
	private Node<T> tail;
	public Node<T> getNode(int index){
		Node<T> temp=null;
		if(header!=null){
			temp=header;
			for (int i = 0; i < index; i++) {
				temp=temp.next;
			}
		}
		return temp;
	}
	public T get(int index){
		if(index>=size){
			throw new IndexOutOfBoundsException("鏈表下標越界");
		}
		Node<T> temp = getNode(index);
		return temp.element;
	}
	public boolean add(T obj){
		
		if(header==null){
			Node<T> temp = new Node<T>(obj, null);
			header=temp;
			tail=temp;
			
		}	else{
			Node<T> temp= new Node<T>(obj,null);
			header.next=temp;
			tail=temp;
		}
		size++;
		return true;
	}
	
	private static class Node<T>{
		private T element;
		private Node<T> next;
		public Node(T element,Node<T> next){
			this.element=element;
			this.next=next;
		}
	}
	public static void main(String[] args) {
		SingleLinkedListed<Student> s = new SingleLinkedListed<Student>();
		s.add(new Student(3,"jack"));
		System.out.println(s.get(0));
	}
}

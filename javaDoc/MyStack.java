package cn.com.List;

public class MyStack <T> {
	private int size;
	private int capacity;
	private T data[];

	public MyStack(int capacity) {
		this.capacity = capacity;
		data = (T[]) new Object[capacity];
	}

	public MyStack() {
		this(10);
	}
	public T push(T obj){
		if(size>=data.length){
			T temp[]=(T[]) new Object[size+20];
			System.arraycopy(data, 0, temp, 0, data.length);
			data=temp;
		}
		System.arraycopy(data, 0, data, 1, size);
		data[0]=obj;
		size++;
		return obj;
		
	}
	public T pop(){
		T temp=data[0];
		System.arraycopy(data, 1, data, 0, size-1);
		size--;
		return temp;
	}
	public T peek(){
		return data[0];
	}
	public boolean isEmpty(){
		return size==0;
	}
	public static void main(String[] args) {
		MyStack<Integer> m = new MyStack<Integer>();
		m.push(1);
		m.push(10);
		System.out.println(m.pop());
		System.out.println(m.size);
	}
}

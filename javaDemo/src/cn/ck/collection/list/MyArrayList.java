package cn.ck.collection.list;

import java.util.Arrays;
import java.util.Collection;



/**
 * 自定义ArrayList
 * @author Administrator
 * ArrayList
 *
 */
public class MyArrayList<E> {
	//ArrayList集合中元素个数
	private int size;
	//ArrayList默认的容量
	private final static int  DEFAULT_CAPACITY=10;
	//用户没有指定容量时，默认长度为零的空数组
	private final static Object [] DEFAULT_EMPTY_ELEMENT={};
	//ArrayList存放元素的数组
	private Object [] element;
	/**
	 * 指定ArrayList是空数组的无参构造方法
	 */
	public MyArrayList(){
		element=DEFAULT_EMPTY_ELEMENT;
	}
	/**
	 * 指定ArrayList元素个数的构造方法
	 * @param capacity 用户指定ArrayList的容量
	 * @throws Exception
	 */
	public MyArrayList(int capacity) throws Exception {
		if(capacity<0){
			throw new Exception("初始数组长度不能小于0");
		} else if(capacity==0){
			this.element=DEFAULT_EMPTY_ELEMENT;
		}
		element=new Object[capacity];
	}
	
	/**
	 * 返回ArrayList中元素个数
	 * @return size
	 */
	public int size(){
		return size;
		
	}
	
	/**
	 * 清空ArrayList的元素
	 */
	public void clear(){
		for (int i = 0; i < size; i++) {
			element[i]=null;
		}
		size=0;
	}
	/**
	 * 判断ArrayList是否为空
	 *
	 */
	public boolean isEmpty(){
		return size==0;
	}
	
	//ArrayList的增加元素的方法
	
	/**
	 * 在ArrayList容器的尾部插入元素
	 * @param e 要插入的元素
	 * @return true 插入成功
	 */
	
	public boolean add(E e){
		ensureCapacity(size+1);
		element[size++]=e;
		return true;

	}
	/**
	 * 在ArrayList特定的下标插入元素
	 * @param index 插入元素的下表
	 * @throws Exception 
	 */
	public void add(int index,E e) throws Exception{
		checkIndex(index);
		ensureCapacity(size+1);
		System.arraycopy(element, index, element, index+1, size-index);
		element[index]=e;
		size++;
		
	}
	/**
	 * 判断传入的下标是否越界
	 * @param index 下标
	 * @throws Exception 
	 */
	private void checkIndex(int index) {
		if(index<0||index>size){
			throw new RuntimeException("插入元素下标越界");
		} 
	}
	
	
	/**
	 * 将一个collection类型的集合的所有元素加在ArrayList容器的尾部
	 * @param cols 需要加入的Collection元素
	 */
	public void addAll(Collection<E> cols){
		
		Object [] c =cols.toArray();
		int newLength=c.length;
		ensureCapacity(size+newLength);
		System.arraycopy(c, 0, element, size, newLength);
		size+=newLength;
	}
	
	/**
	 * 将一个collection类型的集合的所有元素加在ArrayList容器某个位置之后（从某个位置开始）
	 * @param cols 需要新增的Collection元素
	 * @param index collection添加的位置
	 */
	public void addAll(Collection<E> cols,int index){
		checkIndex(index);
		Object [] c =cols.toArray();
		int newLength=c.length;
		ensureCapacity(size+newLength);
		if(size>index){
			System.arraycopy(element, index, element, index+newLength, size-index);

		}
		System.arraycopy(c,0,element,index,newLength);
		size+=newLength;
	}
	/********************************************************/	
	//删除ArrayList元素的方法
	
	/**
	 * 删除ArrayList指定的元素
	 * @param e 要删除的元素
	 */
	public E remove(E e){
		
		
	}
	
	
	/**
	 * 确保ArrayList的容量能插入当前元素,容量不足扩容
	 * @param minCapacity
	 */
	private void ensureCapacity(int minCapacity) {
		if(element==DEFAULT_EMPTY_ELEMENT){
			minCapacity=Math.max(minCapacity, DEFAULT_CAPACITY);
		}
		if(minCapacity>element.length){
			int oldCapacity=element.length;
			int newCapacity=oldCapacity+oldCapacity>>1;
			if(minCapacity>newCapacity){
				newCapacity=minCapacity;
			} 
			Arrays.copyOf(element, newCapacity);
			
		}
		
		
	}
}

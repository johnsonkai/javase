package cn.ck.collection.list;

import java.util.Arrays;
import java.util.Collection;



/**
 * �Զ���ArrayList
 * @author Administrator
 * ArrayList
 *
 */
public class MyArrayList<E> {
	//ArrayList������Ԫ�ظ���
	private int size;
	//ArrayListĬ�ϵ�����
	private final static int  DEFAULT_CAPACITY=10;
	//�û�û��ָ������ʱ��Ĭ�ϳ���Ϊ��Ŀ�����
	private final static Object [] DEFAULT_EMPTY_ELEMENT={};
	//ArrayList���Ԫ�ص�����
	private Object [] element;
	/**
	 * ָ��ArrayList�ǿ�������޲ι��췽��
	 */
	public MyArrayList(){
		element=DEFAULT_EMPTY_ELEMENT;
	}
	/**
	 * ָ��ArrayListԪ�ظ����Ĺ��췽��
	 * @param capacity �û�ָ��ArrayList������
	 * @throws Exception
	 */
	public MyArrayList(int capacity) throws Exception {
		if(capacity<0){
			throw new Exception("��ʼ���鳤�Ȳ���С��0");
		} else if(capacity==0){
			this.element=DEFAULT_EMPTY_ELEMENT;
		}
		element=new Object[capacity];
	}
	
	/**
	 * ����ArrayList��Ԫ�ظ���
	 * @return size
	 */
	public int size(){
		return size;
		
	}
	
	/**
	 * ���ArrayList��Ԫ��
	 */
	public void clear(){
		for (int i = 0; i < size; i++) {
			element[i]=null;
		}
		size=0;
	}
	/**
	 * �ж�ArrayList�Ƿ�Ϊ��
	 *
	 */
	public boolean isEmpty(){
		return size==0;
	}
	
	//ArrayList������Ԫ�صķ���
	
	/**
	 * ��ArrayList������β������Ԫ��
	 * @param e Ҫ�����Ԫ��
	 * @return true ����ɹ�
	 */
	
	public boolean add(E e){
		ensureCapacity(size+1);
		element[size++]=e;
		return true;

	}
	/**
	 * ��ArrayList�ض����±����Ԫ��
	 * @param index ����Ԫ�ص��±�
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
	 * �жϴ�����±��Ƿ�Խ��
	 * @param index �±�
	 * @throws Exception 
	 */
	private void checkIndex(int index) {
		if(index<0||index>size){
			throw new RuntimeException("����Ԫ���±�Խ��");
		} 
	}
	
	
	/**
	 * ��һ��collection���͵ļ��ϵ�����Ԫ�ؼ���ArrayList������β��
	 * @param cols ��Ҫ�����CollectionԪ��
	 */
	public void addAll(Collection<E> cols){
		
		Object [] c =cols.toArray();
		int newLength=c.length;
		ensureCapacity(size+newLength);
		System.arraycopy(c, 0, element, size, newLength);
		size+=newLength;
	}
	
	/**
	 * ��һ��collection���͵ļ��ϵ�����Ԫ�ؼ���ArrayList����ĳ��λ��֮�󣨴�ĳ��λ�ÿ�ʼ��
	 * @param cols ��Ҫ������CollectionԪ��
	 * @param index collection��ӵ�λ��
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
	//ɾ��ArrayListԪ�صķ���
	
	/**
	 * ɾ��ArrayListָ����Ԫ��
	 * @param e Ҫɾ����Ԫ��
	 */
	public E remove(E e){
		
		
	}
	
	
	/**
	 * ȷ��ArrayList�������ܲ��뵱ǰԪ��,������������
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

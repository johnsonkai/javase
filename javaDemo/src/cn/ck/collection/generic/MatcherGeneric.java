package cn.ck.collection.generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * ͨ������� ������<?>,ͨ�������ֻ������ָ��������û�о���ʹ��
 * ͨ������� �Ͻ������� <? super T>
 * ͨ��������½�������<? extends T>
 * @author Administrator
 * �ܽ᣺
JDK5�еķ����������Ա�ڱ�д���ϴ���ʱ�������Ƽ��ϵĴ������ͣ��Ӷ���ԭ����������ʱ���ܷ������⣬ת��Ϊ����ʱ�����⣬�Դ���߳���Ŀɶ��Ժ��ȶ�
ע�⣺�������ṩ��javac������ʹ�õģ��������޶����ϵ��������ͣ��ñ�������Դ���뼶���ϣ�����ס�򼯺��в���Ƿ����ݡ�����������������з��ε�java��������ɵ�class�ļ��н����ٴ��з�����Ϣ���Դ�ʹ��������Ч�ʲ��ܵ�Ӱ�죬������̳�֮Ϊ����������
���͵Ļ��������ArrayList<E>Ϊ����<>����typeof
ArrayList<E>�е�E��Ϊ���Ͳ�������
ArrayList<Integer>�е�Integer��Ϊʵ�����Ͳ���
������ΪArrayList<E>��������
����ArrayList<Integer>��Ϊ������������ParameterizedType
 *
 */
public class MatcherGeneric {
	
	public static void main(String[] args) {
		Set<String> sets=new HashSet<String>();
		sets.add("jack");
		sets.add("mary");
		Set<Number> set1s=new HashSet<Number>();
		set1s.add(1);
		set1s.add(2);
		Set<Number> set2s=new HashSet<Number>();
		set2s.add(1.2);
		set2s.add(2.1);
		printIntegerSuper(set1s);
		printCollection(sets);
		printNumberChild(set2s);
	
		//printArrayListSuper(sets);����
		
		
	}
	/**
	 * һ��������һ�����϶���Ȼ�������ӡ�����ϵ�����Ԫ��,��֪������Ԫ�ص�����
	 * @param cols ���϶���
	 */
	public static void printCollection(Collection<?> cols){
		Iterator<?> it= cols.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}
	/**
	 * ͨ����½����
	 * һ��������һ�����϶���Ȼ�������ӡ�����ϵ�����Ԫ��,����Ԫ�ص�������Integer�����
	 * 
	 * @param cols ���϶���
	 */
	public static void printIntegerSuper(Collection<? super Integer > cols){
		Iterator<?> it= cols.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}
	
	/**
	 * ͨ����Ͻ����
	 * һ��������һ�����϶���Ȼ�������ӡ�����ϵ�����Ԫ��,����Ԫ�ص�������
	 * @param cols ���϶���
	 */
	public static void printNumberChild(Collection<? extends Number > cols){
		Iterator<?> it= cols.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}
}

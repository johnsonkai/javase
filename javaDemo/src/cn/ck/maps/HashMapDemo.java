package cn.ck.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * ��Student�����Map�����÷�
 * @author Administrator
 *ע���������foreach����iterator�������ϣ������ü��϶���Լ���Ԫ�ظ��������޸ģ����ӣ�ɾ��������,����ᱨjava.util.ConcurrentModificationException����
 *������itertor�Լ���Ԫ�ظ��������޸ġ�
 */
public class HashMapDemo {
	public static void main(String[] args) {
		
		//��ӷ��� put����ֵΪ�����Ԫ�ص�valueֵ
		Map<String, Student> groupALL=new HashMap<String, Student>();
		groupALL.put("1", new Student("jack", 23));
		groupALL.put("2", new Student("jerk", 33));
		Map<String, Student> groupA=new HashMap<String, Student>();
		groupA.put("3", new Student("mary", 21));
		//�����ӵ�Ԫ�صļ��Ѿ����ڣ����ؾõ�value����ʵ�ʲ���map��value��Ĭ�����µ�����õġ�
		groupALL.put("1", new Student("jack1", 23));
		groupA.put("4", new Student("tom", 31));
		groupA.put("5", new Student("lili", 31));
		//putAll��һ��map��ӵ���һ��map��
		groupALL.putAll(groupA);
		//hashmap��toString������ӡ����ֵ��tostringƴ�ӡ�
		System.out.println(groupALL);
		//printMapTwo(groupALL);
		//printMapThree(groupALL);
		
		//ɾ���ķ��� remove(K key)ͨ��keyɾ��,����Ҫɾ����value
		System.out.println(groupALL.remove("4"));
		//ɾ���ķ���remove(K key,V value) ����һ��boolean���͡�
		System.out.println(groupALL.remove("3", new Student("mary", 21)));
		//ɾ��map������Ԫ�أ�clear() 
		groupA.clear();
		System.out.println(groupA);
		
		//��ȡ����
		//size����  
		System.out.println("groupALL��Ԫ�ظ���Ϊ"+groupALL.size());
		
		//get()��������ȡmap��value
		System.out.println(groupALL.get("1"));
		
		//�жϷ��� containKey containValue isEmpty
		//�ж�map���Ƿ���ĳ��key,����boolean����
		System.out.println(groupALL.containsKey("1"));
		//�ж�map���Ƿ�ĳ��value,����boolean����
		System.out.println(groupALL.toString());
		System.out.println(groupALL.containsValue(new Student("mary", 21)));
		//�ж�map�Ƿ�Ϊ��
		System.out.println(groupALL.isEmpty());
		printMap(groupALL);


		
	}
	//����map���ϣ������еļ���ֵ�������ʽ1ͨ��entrySet������map��ÿ��Ԫ�ص�key��value ��װentry�ɶ���Ȼ�����е�entry��������set�����У���mapת����set���ϣ�������Ȼ�����set���ϵõ���Ӧ�ļ���ֵ
	public static <K,V> void printMap(Map<K,V> p){
		Set<Map.Entry<K,V>> set=p.entrySet();
		Iterator<Map.Entry<K,V>> it=set.iterator();
		while(it.hasNext()){
			Map.Entry<K,V> entry=it.next();
			if(entry.getKey()=="1"||entry.getKey().equals("1")){
				it.remove();
			}
			System.out.println("���ǣ�"+entry.getKey()+",ֵΪ��"+entry.getValue());
		}
		
		
	}
	//����map�ĵڶ��ַ�ʽ��ͨ��keySet������ȡ���м���ɵ�һ��set���ϣ�������set���ϣ���ȡÿ����������map��get������ȡvalue��
	public static <K,V> void printMapTwo(Map<K,V> p){
		Set<K> keys=p.keySet();
		Iterator<K> its=keys.iterator();
		while(its.hasNext()){
			K key=its.next();
			V stu=p.get(key);
			System.out.println("��Ϊ��"+key+",ֵΪ��"+stu.toString());
		}
		
	}
	//����map�ĵ����ַ�ʽ��ͨ��values����ֻ�ܻ�ȡmap��value
	public static <K,V>void printMapThree(Map<K,V> p){
		 Collection<V> values=p.values();
		Iterator<V> its=values.iterator();
		while(its.hasNext()){
			System.out.println("ֵΪ��"+its.next().toString());
		}
		
	}
	

}

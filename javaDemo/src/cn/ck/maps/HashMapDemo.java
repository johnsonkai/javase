package cn.ck.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 以Student类测试Map各种用法
 * @author Administrator
 *注意事项：当用foreach或者iterator遍历集合，不能用集合对象对集合元素个数进行修改（增加，删除操作）,否则会报java.util.ConcurrentModificationException错误。
 *可以用itertor对集合元素个数进行修改。
 */
public class HashMapDemo {
	public static void main(String[] args) {
		
		//添加方法 put返回值为新添加元素的value值
		Map<String, Student> groupALL=new HashMap<String, Student>();
		groupALL.put("1", new Student("jack", 23));
		groupALL.put("2", new Student("jerk", 33));
		Map<String, Student> groupA=new HashMap<String, Student>();
		groupA.put("3", new Student("mary", 21));
		//如果添加的元素的键已经存在，返回久的value，而实际插入map的value，默认用新的替代久的。
		groupALL.put("1", new Student("jack1", 23));
		groupA.put("4", new Student("tom", 31));
		groupA.put("5", new Student("lili", 31));
		//putAll将一个map添加到另一个map中
		groupALL.putAll(groupA);
		//hashmap的toString方法打印键与值的tostring拼接。
		System.out.println(groupALL);
		//printMapTwo(groupALL);
		//printMapThree(groupALL);
		
		//删除的方法 remove(K key)通过key删除,返回要删除的value
		System.out.println(groupALL.remove("4"));
		//删除的方法remove(K key,V value) 返回一个boolean类型。
		System.out.println(groupALL.remove("3", new Student("mary", 21)));
		//删除map的所有元素：clear() 
		groupA.clear();
		System.out.println(groupA);
		
		//获取方法
		//size方法  
		System.out.println("groupALL的元素个数为"+groupALL.size());
		
		//get()方法，获取map的value
		System.out.println(groupALL.get("1"));
		
		//判断方法 containKey containValue isEmpty
		//判断map中是否含有某个key,返回boolean类型
		System.out.println(groupALL.containsKey("1"));
		//判断map中是否含某个value,返回boolean类型
		System.out.println(groupALL.toString());
		System.out.println(groupALL.containsValue(new Student("mary", 21)));
		//判断map是否为空
		System.out.println(groupALL.isEmpty());
		printMap(groupALL);


		
	}
	//遍历map集合，将所有的键与值输出，方式1通过entrySet方法将map中每个元素的key与value 封装entry成对象，然后将所有的entry对象存放在set集合中，将map转换成set集合（将），然后遍历set集合得到相应的键与值
	public static <K,V> void printMap(Map<K,V> p){
		Set<Map.Entry<K,V>> set=p.entrySet();
		Iterator<Map.Entry<K,V>> it=set.iterator();
		while(it.hasNext()){
			Map.Entry<K,V> entry=it.next();
			if(entry.getKey()=="1"||entry.getKey().equals("1")){
				it.remove();
			}
			System.out.println("键是："+entry.getKey()+",值为："+entry.getValue());
		}
		
		
	}
	//遍历map的第二种方式，通过keySet方法获取所有键组成的一个set集合，遍历键set集合，获取每个键，再用map的get方法获取value。
	public static <K,V> void printMapTwo(Map<K,V> p){
		Set<K> keys=p.keySet();
		Iterator<K> its=keys.iterator();
		while(its.hasNext()){
			K key=its.next();
			V stu=p.get(key);
			System.out.println("键为："+key+",值为："+stu.toString());
		}
		
	}
	//遍历map的第三种方式，通过values方法只能获取map的value
	public static <K,V>void printMapThree(Map<K,V> p){
		 Collection<V> values=p.values();
		Iterator<V> its=values.iterator();
		while(its.hasNext()){
			System.out.println("值为："+its.next().toString());
		}
		
	}
	

}

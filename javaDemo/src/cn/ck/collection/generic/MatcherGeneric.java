package cn.ck.collection.generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * 通配符泛型 声明：<?>,通配符泛型只能用来指定声明，没有具体使用
 * 通配符泛型 上界声明： <? super T>
 * 通配符泛型下界声明：<? extends T>
 * @author Administrator
 * 总结：
JDK5中的泛型允许程序员在编写集合代码时，就限制集合的处理类型，从而把原来程序运行时可能发生问题，转变为编译时的问题，以此提高程序的可读性和稳定
注意：泛型是提供给javac编译器使用的，它用于限定集合的输入类型，让编译器在源代码级别上，即挡住向集合中插入非法数据。但编译器编译完带有泛形的java程序后，生成的class文件中将不再带有泛形信息，以此使程序运行效率不受到影响，这个过程称之为“擦除”。
泛型的基本术语，以ArrayList<E>为例：<>念着typeof
ArrayList<E>中的E称为类型参数变量
ArrayList<Integer>中的Integer称为实际类型参数
整个称为ArrayList<E>泛型类型
整个ArrayList<Integer>称为参数化的类型ParameterizedType
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
	
		//printArrayListSuper(sets);报错
		
		
	}
	/**
	 * 一个方法传一个集合对象，然后遍历打印出集合的所有元素,不知道集合元素的类型
	 * @param cols 集合对象
	 */
	public static void printCollection(Collection<?> cols){
		Iterator<?> it= cols.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}
	/**
	 * 通配符下界测试
	 * 一个方法传一个集合对象，然后遍历打印出集合的所有元素,集合元素的类型是Integer类或父类
	 * 
	 * @param cols 集合对象
	 */
	public static void printIntegerSuper(Collection<? super Integer > cols){
		Iterator<?> it= cols.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}
	
	/**
	 * 通配符上界测试
	 * 一个方法传一个集合对象，然后遍历打印出集合的所有元素,集合元素的类型是
	 * @param cols 集合对象
	 */
	public static void printNumberChild(Collection<? extends Number > cols){
		Iterator<?> it= cols.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}
}

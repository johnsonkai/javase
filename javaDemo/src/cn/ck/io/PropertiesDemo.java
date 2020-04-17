package cn.ck.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

/**
 * 
 * 可以和流相关联的集合对象Properties.
 *Map
 *|--Hashtable
 * |--Properties
 * Properties:该集合不需要泛型，因为该集合中的键值对都是String类型。
 * @author Administrator
 *将系统属性存放在test.properties配置文件中。
*
* 
* 
* 
* 
* 
 */
public class PropertiesDemo {
	public static void main(String[] args) throws IOException {
		//将系统属性加载到properties集合中
		Properties pros=System.getProperties();
		//将系统属性存放在test.properties配置文件中
		pros.list(new PrintStream(new File("src/cn/ck/io/test.properties")));
		//在properties集合中新增一个属性，
		pros.setProperty("system_version", "9.3");
		//将新增的属性加载到配置文件test.properties中
		pros.store(new PrintStream(new File("src/cn/ck/io/test.properties")), "store success");
		//根据集合的某一个键值获取相应属性值
		String users=pros.getProperty("user.country");
		System.out.println(users);
		//获取集合中所有的键跟属性值，方式1：先通过stringPropertyNames获取所有键的方法，然后根据键获取相应的属性值
		Set<String> keys=pros.stringPropertyNames();
		Iterator<String> it=keys.iterator();
		while(it.hasNext()){
			String key=it.next();
			String value=pros.getProperty(key);
			System.out.println(key+"="+value);
		}
		//方式2：通过获取集合的entryset对象，然后遍历entryset对象获取key value
		Set<Entry<Object, Object>> entrySets= pros.entrySet();
		for(Entry entry:entrySets){
			System.out.println("key"+entry.getKey()+"="+entry.getValue());
		}
		
		
		
	}
}

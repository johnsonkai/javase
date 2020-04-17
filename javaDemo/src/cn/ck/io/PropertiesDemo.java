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
 * ���Ժ���������ļ��϶���Properties.
 *Map
 *|--Hashtable
 * |--Properties
 * Properties:�ü��ϲ���Ҫ���ͣ���Ϊ�ü����еļ�ֵ�Զ���String���͡�
 * @author Administrator
 *��ϵͳ���Դ����test.properties�����ļ��С�
*
* 
* 
* 
* 
* 
 */
public class PropertiesDemo {
	public static void main(String[] args) throws IOException {
		//��ϵͳ���Լ��ص�properties������
		Properties pros=System.getProperties();
		//��ϵͳ���Դ����test.properties�����ļ���
		pros.list(new PrintStream(new File("src/cn/ck/io/test.properties")));
		//��properties����������һ�����ԣ�
		pros.setProperty("system_version", "9.3");
		//�����������Լ��ص������ļ�test.properties��
		pros.store(new PrintStream(new File("src/cn/ck/io/test.properties")), "store success");
		//���ݼ��ϵ�ĳһ����ֵ��ȡ��Ӧ����ֵ
		String users=pros.getProperty("user.country");
		System.out.println(users);
		//��ȡ���������еļ�������ֵ����ʽ1����ͨ��stringPropertyNames��ȡ���м��ķ�����Ȼ����ݼ���ȡ��Ӧ������ֵ
		Set<String> keys=pros.stringPropertyNames();
		Iterator<String> it=keys.iterator();
		while(it.hasNext()){
			String key=it.next();
			String value=pros.getProperty(key);
			System.out.println(key+"="+value);
		}
		//��ʽ2��ͨ����ȡ���ϵ�entryset����Ȼ�����entryset�����ȡkey value
		Set<Entry<Object, Object>> entrySets= pros.entrySet();
		for(Entry entry:entrySets){
			System.out.println("key"+entry.getKey()+"="+entry.getValue());
		}
		
		
		
	}
}

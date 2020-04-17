package cn.ck.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

/**
 * ģ���û����ʳ���Ĵ�����ͨ��test.txt������¼�û����ʳ���Ĵ���������û����������ξ����ѡ�
 * @author Administrator
 *
 */
public class PropertiesDemo02 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties properties =new Properties();
		File f=new File("./src/cn/ck/io/test.txt");
		if(!f.exists()){
			f.createNewFile();
		}
		InputStream is=new FileInputStream(f);
		properties.load(is);
		String countValue=(String) properties.get("count");
		int count=0;
		if(countValue!=null){
			count=Integer.parseInt(countValue);
		}
		if(count>2){
			System.out.println("���Ѿ����ʹ�����Σ��븶��");
			System.exit(0);
		}
		count++;
		System.out.println("����ʹ��"+count+"��");
		properties.setProperty("count", count+"");
		OutputStream out=new FileOutputStream(f);
		properties.store(out, "ʹ����"+count+"��");
		is.close();
		out.close();
	}
}

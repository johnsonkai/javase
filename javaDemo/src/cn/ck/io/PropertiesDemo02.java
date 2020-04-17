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
 * 模拟用户访问程序的次数。通过test.txt方法记录用户访问程序的次数，如果用户访问了三次就提醒。
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
			System.out.println("您已经免费使用三次，请付费");
			System.exit(0);
		}
		count++;
		System.out.println("您已使用"+count+"次");
		properties.setProperty("count", count+"");
		OutputStream out=new FileOutputStream(f);
		properties.store(out, "使用了"+count+"次");
		is.close();
		out.close();
	}
}

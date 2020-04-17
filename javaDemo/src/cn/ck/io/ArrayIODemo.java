package cn.ck.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.sun.xml.internal.messaging.saaj.util.CharReader;
import com.sun.xml.internal.messaging.saaj.util.CharWriter;

/**
 *字节数组流：ByteArrayInputStream, ByteArrayOutputStream直接继承字节流的超类 InputStream,OutputStream.
 *字符数组流：CharArrayInputStream,CharArrayOutputStream
 *对于这些流，源是内存。目的也是内存。
 *而且这些流并未调用系统资源。使用的就是内存中的数组。
 *这些流没有调用系统资源，不需要close对流进行关闭操作，
 * @author Administrator
 *
 */
public class ArrayIODemo {
	public static void main(String[] args) throws IOException {
		File f=new File("src/cn/ck/io/test.txt");
		File dest=new File("src/cn/ck/io/test2.txt");
		//ByteArrayOutputStream bos=getArrayFromFile(f);
		//System.out.println(new String(bos.toByteArray()));
		
		//getFileInfoFromByteArray(bos, dest);
		
		getFileInfoFromCharArray(getCharArrayFromFile(f), dest);
	}
	/**
	 * 将文件的内容以字节数组的方法存放在byte数组流中
	 * @throws IOException 
	 */
	public static ByteArrayOutputStream getArrayFromFile(File f) throws IOException{
		FileInputStream fis=new FileInputStream(f);
		ByteArrayOutputStream bos=new ByteArrayOutputStream();//无参构造方法中指定了一个可变字节数组，数组长度默认是32。
		byte b [] =new byte[1024];
		int len=0;
		while((len=fis.read(b))!=-1){
			bos.write(b, 0, len);//将文件流读出的字节内容存写入数组字节流的byte数组中
		}
		fis.close();
		return bos;
	}
	/**
	 * 将字节数组流中的字节数据存放到文件中
	 * @throws IOException 
	 */
	public static void getFileInfoFromByteArray(ByteArrayOutputStream bos,File dest) throws IOException{
		byte[] b=bos.toByteArray();//获取数组字节流中字节数组
		ByteArrayInputStream bis=new ByteArrayInputStream(b);//数组字节输入流要穿一个byte数组，给该流读
		FileOutputStream fos=new FileOutputStream(dest);
		if(bis.read(b)!=-1){
			fos.write(b);
		}
		
		fos.close();
	}
	/**
	 * 将文件的内容以字符数组流的方法存放在char数组流中
	 * @param f
	 * @return
	 * @throws IOException
	 */
	public static CharArrayWriter getCharArrayFromFile(File f) throws IOException{
		FileReader fw=new FileReader(f);
		CharArrayWriter cw=new CharArrayWriter();//无参构造方法中指定了一个可变字符数组，数组长度默认是32。
		char c [] =new char[1024];
		int len=0;
		while((len=fw.read(c))!=-1){
			cw.write(c, 0, len);//将文件流读出的字符内容存写入数组字节流的char数组中
		}
		fw.close();
		return cw;
	}
	 
	/**
	 * 将字符数组流中的字符数据存放到文件中
	 * @throws IOException 
	 */
	public static void getFileInfoFromCharArray(CharArrayWriter cw,File dest) throws IOException{
		char [] c=cw.toCharArray();//获取字符数组流中字符数组
		CharArrayReader cr =new CharArrayReader(c);//字符数组输入流要传一个char数组，给该流读
		FileWriter fw=new FileWriter(dest);
		if(cr.read(c)!=-1){
			fw.write(c);
		}
		
		fw.close();
	}
}

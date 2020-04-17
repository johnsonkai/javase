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
 *�ֽ���������ByteArrayInputStream, ByteArrayOutputStreamֱ�Ӽ̳��ֽ����ĳ��� InputStream,OutputStream.
 *�ַ���������CharArrayInputStream,CharArrayOutputStream
 *������Щ����Դ���ڴ档Ŀ��Ҳ���ڴ档
 *������Щ����δ����ϵͳ��Դ��ʹ�õľ����ڴ��е����顣
 *��Щ��û�е���ϵͳ��Դ������Ҫclose�������йرղ�����
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
	 * ���ļ����������ֽ�����ķ��������byte��������
	 * @throws IOException 
	 */
	public static ByteArrayOutputStream getArrayFromFile(File f) throws IOException{
		FileInputStream fis=new FileInputStream(f);
		ByteArrayOutputStream bos=new ByteArrayOutputStream();//�޲ι��췽����ָ����һ���ɱ��ֽ����飬���鳤��Ĭ����32��
		byte b [] =new byte[1024];
		int len=0;
		while((len=fis.read(b))!=-1){
			bos.write(b, 0, len);//���ļ����������ֽ����ݴ�д�������ֽ�����byte������
		}
		fis.close();
		return bos;
	}
	/**
	 * ���ֽ��������е��ֽ����ݴ�ŵ��ļ���
	 * @throws IOException 
	 */
	public static void getFileInfoFromByteArray(ByteArrayOutputStream bos,File dest) throws IOException{
		byte[] b=bos.toByteArray();//��ȡ�����ֽ������ֽ�����
		ByteArrayInputStream bis=new ByteArrayInputStream(b);//�����ֽ�������Ҫ��һ��byte���飬��������
		FileOutputStream fos=new FileOutputStream(dest);
		if(bis.read(b)!=-1){
			fos.write(b);
		}
		
		fos.close();
	}
	/**
	 * ���ļ����������ַ��������ķ��������char��������
	 * @param f
	 * @return
	 * @throws IOException
	 */
	public static CharArrayWriter getCharArrayFromFile(File f) throws IOException{
		FileReader fw=new FileReader(f);
		CharArrayWriter cw=new CharArrayWriter();//�޲ι��췽����ָ����һ���ɱ��ַ����飬���鳤��Ĭ����32��
		char c [] =new char[1024];
		int len=0;
		while((len=fw.read(c))!=-1){
			cw.write(c, 0, len);//���ļ����������ַ����ݴ�д�������ֽ�����char������
		}
		fw.close();
		return cw;
	}
	 
	/**
	 * ���ַ��������е��ַ����ݴ�ŵ��ļ���
	 * @throws IOException 
	 */
	public static void getFileInfoFromCharArray(CharArrayWriter cw,File dest) throws IOException{
		char [] c=cw.toCharArray();//��ȡ�ַ����������ַ�����
		CharArrayReader cr =new CharArrayReader(c);//�ַ�����������Ҫ��һ��char���飬��������
		FileWriter fw=new FileWriter(dest);
		if(cr.read(c)!=-1){
			fw.write(c);
		}
		
		fw.close();
	}
}

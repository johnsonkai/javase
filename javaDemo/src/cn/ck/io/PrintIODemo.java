package cn.ck.io;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.Scanner;

/**
 * ��ӡ��PrintStream,PrintWriter
 * public class PrintStream extends FilterOutputStream
 * PrintStream�̳����ֽ�������İ�װ��ĸ���FilterOutputStream
 * 1����ӡ�����췽�����������ǿ���ָ���Զ�ˢ��
 *
 * 2����ӡ�������ļ������ļ�·��ʱ����ָ���ļ��Ƿ�׷��д�ļ����ݣ�ֻ�ܸ���д����Ҫ׷��д�����봫�ļ������ļ����Ĺ�����ָ��׷��д
 * ��ͬ��
 * 1��PrintWriter�ڹ��췽���в�����ֱ��ָ�������ʽ������ͨ��OutputStreamWriterָ��
 * ���Զ�PrintStream����ָ��ֱ�ӱ����ʽ��
 * 2��PrintWriter���԰�װ�ֽ�����Ҳ���԰�װ�ַ�����PrintStreamֻ�ܰ�װ�ֽ�����
 * 3��PrintStreame��ӡ����print println printf append��������ֱ���Զ�ˢ�¡�write���������ڹ��췽����ָ���Զ�ˢ�²����Զ�ˢ�£�����Ҫ��close��flush����ˢ�¡�
 * PrintWriter��ӡ����print println printf append������ֱ��ˢ�£������ڹ��췽��ָ���Զ�ˢ�²����Զ�ˢ�£�write������ָ���Զ�ˢ��Ҫ��flush��closeˢ�¡�
 * @author Administrator
 *
 */
public class PrintIODemo {
		public static void main(String[] args) throws IOException {
			//testPrintStream();
			testScanner();
			//testPrintWriter();
		}
		
		public static void testPrintStream() throws IOException{
	    	PrintStream sOut=System.out;//ϵͳ�ֽڴ�ӡ��(ָ���Զ�ˢ�µ�)��
	    	sOut.printf("%d %f %c %s", 100,23.5,'��',"�й�");//��ʽ����ӡ
	    	sOut.print(10.5);//�˴�������͵�short byte���Ͳ��ܴ�ӡ���������ܴ�ӡ,�����ַ�������Object�����ܴ�ӡ��
	    	sOut.println(new Object());//println()�ܻ��в���
	    	sOut.printf("%4s��%8s ��۸�ս", "����", "����");
	    	sOut.append("С��");//append����ֻ��׷�Ӵ�ӡ�ַ����ַ�������
	    	/*sOut.write(100);
	    	sOut.close();*///printStream ��write���������Զ�ˢ�£�Ҫ��close�����������ܽ�����ˢ�µ�����̨
	    	
	    	/**
	    	 * ��ӡ���Ĺ��췽��
	    	 * PrintStream(OutputStream out, boolean autoFlush, String encoding)
	    	 * PrintStream(OutputStream out, boolean autoFlush)
	    	 * PrintStream(OutputStream out)
	    	 * PrintStream(String fileName)
	    	 * PrintStream(File f)
	    	 */
	    	//�Լ�����һ���ļ���ӡ�������Զ�ˢ�µı�־�����ñ����ʽ���Ḳ��ԭ�����ļ�����,���ļ����������Ƿ񸲸��ļ����ݣ�����׷�����ݡ�
	    	PrintStream fOut=new PrintStream(new FileOutputStream("src/cn/ck/io/test.txt",true),true,"UTF-8");
	    	fOut.append("С��");
	    	fOut.write("С��".getBytes("UTF-8"));//ָ�������ʽΪuft-8����Ȼ����
	    	fOut.print("jack");
	    	//����system�Ĵ�ӡ����ΪfOut
	    	System.setOut(fOut);//System.out=fOut;
	    	System.out.print("ddf");//��ӡ�Ķ�����ӡ��test�ļ�����
	    	fOut.println("����systemout");
	    	System.setOut(sOut);
	    	System.out.println("ddf");
	    	//���ؿ���̨����FileDescriptor.out�����Ҳ��ָ�����̨����
	    	System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));
			System.out.print("you lose");
			
	    	
	    	
	    }
		/**
		 * Scanner��һ������ʹ��������ʽ�������������ͺ��ַ����ļ��ı�ɨ������
		 * Scanner��ͨ����(�ļ�·�����ļ�����õ�һ���ļ���)�õ���Ӧ���ı���Ϣ��Ȼ��ͨ��������ʽ�������ı����������ͣ�scannerͨ���ָ���ģʽ���ļ����зֽ⣬�ֽ�ɵ����ݽ�����־
		 * �ָ���Ĭ����հ�ƥ�䣬���ֽ�ı�־ͨ������next����ת����������Ҫ����������.
		 * scanner�ೣ�÷���
		 * ���췽����
		 * Scanner(File f)
		 * Scanner(InputStream is)
		 * 
		 * @throws FileNotFoundException 
		 */
		public static void testScanner() throws FileNotFoundException{
			FileInputStream fis=new FileInputStream("src/cn/ck/io/test.txt");
			//ͨ���ļ����ķ���
			/*Scanner scan=new Scanner(fis);
			int a=scan.nextInt();
			float b=scan.nextFloat();
			String c =scan.next();
			System.out.println("a="+a+",b="+b+",c="+c);*/
			//ͨ�����ķ�������õģ�ϵͳ��System.in,����Inputstream ���͵���
			
			/*Scanner scan1 =new Scanner(System.in);
			System.out.println(scan1.nextInt());*/
			//ָ���ļ���ΪSystem.in���������
			System.setIn(fis);
			Scanner scan2=new Scanner(System.in);
			int a1=scan2.nextInt();
			System.out.println(a1);
			
			
		}
		/**
		 * ����PrintWriter���췽��
		 * PrintWriter (Writer out)
		 * PrintWriter(Writer out,boolean autoFlush)
		 * PrintWriter(String fileName)
		 * PrintWriter(FileName fileName)
		 * PrintWriter(OutputStream out)
		 * PrintWriter(OutputStream out,boolean autoFlush)
		 * @throws FileNotFoundException 
		 * @throws UnsupportedEncodingException 
		 */
		public static void testPrintWriter() throws UnsupportedEncodingException, FileNotFoundException{
			//�ַ���ӡ��ָ�������ʽ���Զ�����,�ļ���׷��д
			PrintWriter ps= new PrintWriter(new OutputStreamWriter(new FileOutputStream("src/cn/ck/io/test2.txt",true), "UTF-8"),true);
			//����������PrintStream
			ps.println("test");
			ps.write("jack");
			ps.flush();
			
		}
		
}
    

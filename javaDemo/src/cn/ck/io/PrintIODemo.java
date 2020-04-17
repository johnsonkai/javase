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
 * 打印流PrintStream,PrintWriter
 * public class PrintStream extends FilterOutputStream
 * PrintStream继承了字节输出流的包装类的父类FilterOutputStream
 * 1：打印流构造方法传流对象是可以指定自动刷新
 *
 * 2：打印流传的文件对象，文件路径时不能指定文件是否追加写文件内容，只能覆盖写，想要追加写，必须传文件流中文件流的构造中指定追加写
 * 不同点
 * 1：PrintWriter在构造方法中不可以直接指定编码格式，可以通过OutputStreamWriter指定
 * 可以而PrintStream可以指定直接编码格式。
 * 2：PrintWriter可以包装字节流，也可以包装字符流，PrintStream只能包装字节流。
 * 3：PrintStreame打印流的print println printf append方法可以直接自动刷新。write方法必须在构造方法中指定自动刷新才能自动刷新，否则要用close，flush方法刷新。
 * PrintWriter打印流的print println printf append不可以直接刷新，必须在构造方法指定自动刷新才能自动刷新，write方法不指定自动刷新要用flush，close刷新。
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
	    	PrintStream sOut=System.out;//系统字节打印流(指定自动刷新的)。
	    	sOut.printf("%d %f %c %s", 100,23.5,'中',"中国");//格式化打印
	    	sOut.print(10.5);//八大基本类型的short byte类型不能打印，其他都能打印,还有字符串，根Object类型能打印。
	    	sOut.println(new Object());//println()能换行操作
	    	sOut.printf("%4s和%8s 打价格战", "京东", "苏宁");
	    	sOut.append("小镇");//append方法只能追加打印字符或字符串类型
	    	/*sOut.write(100);
	    	sOut.close();*///printStream 用write方法不能自动刷新，要用close（）方法才能将数据刷新到控制台
	    	
	    	/**
	    	 * 打印流的构造方法
	    	 * PrintStream(OutputStream out, boolean autoFlush, String encoding)
	    	 * PrintStream(OutputStream out, boolean autoFlush)
	    	 * PrintStream(OutputStream out)
	    	 * PrintStream(String fileName)
	    	 * PrintStream(File f)
	    	 */
	    	//自己创建一个文件打印流，带自动刷新的标志，设置编码格式，会覆盖原来的文件内容,在文件流中设置是否覆盖文件内容，还是追加内容。
	    	PrintStream fOut=new PrintStream(new FileOutputStream("src/cn/ck/io/test.txt",true),true,"UTF-8");
	    	fOut.append("小明");
	    	fOut.write("小李".getBytes("UTF-8"));//指定编码格式为uft-8，不然乱码
	    	fOut.print("jack");
	    	//设置system的打印流流为fOut
	    	System.setOut(fOut);//System.out=fOut;
	    	System.out.print("ddf");//打印的东西打印到test文件中了
	    	fOut.println("我是systemout");
	    	System.setOut(sOut);
	    	System.out.println("ddf");
	    	//返回控制台的流FileDescriptor.out这个流也是指向控制台的流
	    	System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));
			System.out.print("you lose");
			
	    	
	    	
	    }
		/**
		 * Scanner类一个可以使用正则表达式来解析基本类型和字符串的简单文本扫描器，
		 * Scanner是通过流(文件路径，文件对象得到一个文件流)得到相应的文本信息，然后通过正则表达式来解析文本的数据类型，scanner通过分隔符模式将文件进行分解，分解成的内容叫做标志
		 * 分隔符默认与空白匹配，将分解的标志通过各种next方法转换成我们需要的数据内容.
		 * scanner类常用方法
		 * 构造方法：
		 * Scanner(File f)
		 * Scanner(InputStream is)
		 * 
		 * @throws FileNotFoundException 
		 */
		public static void testScanner() throws FileNotFoundException{
			FileInputStream fis=new FileInputStream("src/cn/ck/io/test.txt");
			//通过文件流的方法
			/*Scanner scan=new Scanner(fis);
			int a=scan.nextInt();
			float b=scan.nextFloat();
			String c =scan.next();
			System.out.println("a="+a+",b="+b+",c="+c);*/
			//通过流的方法最，常用的，系统流System.in,属性Inputstream 类型的流
			
			/*Scanner scan1 =new Scanner(System.in);
			System.out.println(scan1.nextInt());*/
			//指定文件流为System.in对象这个流
			System.setIn(fis);
			Scanner scan2=new Scanner(System.in);
			int a1=scan2.nextInt();
			System.out.println(a1);
			
			
		}
		/**
		 * 测试PrintWriter构造方法
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
			//字符打印流指定编码格式，自动涮新,文件流追加写
			PrintWriter ps= new PrintWriter(new OutputStreamWriter(new FileOutputStream("src/cn/ck/io/test2.txt",true), "UTF-8"),true);
			//其他操作跟PrintStream
			ps.println("test");
			ps.write("jack");
			ps.flush();
			
		}
		
}
    

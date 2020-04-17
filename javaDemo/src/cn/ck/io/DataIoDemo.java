package cn.ck.io;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

/**
 * DataInputStream，DataOutPutStream这二个数据流专门读写primitive 何string类型的数据
 * 1:数据流继承关系：继承了字节包装类的父类FilterInputStream,FilterOutputStream
 *  DataOutputStream extends FilterOutputStream implements DataOutput
 *  class DataInputStream extends FilterInputStream implements DataInput
 *  2:数据流只有传InputStream OutputStream类型的构造方法
 *  3:数据流必须按照写的顺序，读出相应的数据
 *  4.最好不要在读写primitive过程中，另外用单独的write，read方法进行读写操作。
 * @author Administrator
 *
 */
public class DataIoDemo {
	public static void main(String[] args) throws IOException {
		writePrStrIntoFile(new File("src/cn/ck/io/data.txt"));//输出流可以创建一个不存在的目录，前提目录必须存在。
		readPrStrFromFile(new File("src/cn/ck/io/data.txt"));
	}
	/**
	 * 将基本类型数据，string类型数据存放在内存的字节数组中（字节数组流）
	 * @throws IOException 
	 * @ param f:表示存储基本类型和字符类型数据的文件对象·
	 */
	public static void writePrStrIntoFile(File f) throws IOException{
		DataOutputStream dos =new DataOutputStream(new FileOutputStream(f));
		dos.writeInt(5);
		dos.writeBoolean(true);
		dos.writeUTF("dfdsfs");
		dos.write("dssdsdf".getBytes());//最好不要将write方法跟writeint这些方法混合使用。
		dos.writeChar('c');
		dos.writeFloat(5.3f);
		dos.writeDouble(45.6);
		dos.writeByte(5);
		dos.writeShort(34);
		
		dos.close();
	}
	
	/**
	 * 
	 * @param f 存放数据的文件
	 * @throws IOException 
	 */
	public static void readPrStrFromFile(File f) throws IOException{
		DataInputStream dis=new DataInputStream(new FileInputStream(f));
		int a=dis.readInt();
		Boolean bool=dis.readBoolean();
		String str=dis.readUTF();
		byte[] b1=new byte[7];//必须指定读的字节数，必须是准确的，不然将后面数据的字节读出来
		System.out.println(new String(b1,0,dis.read(b1)));
		char c=dis.readChar();
		System.out.println(c);
		
		
		
	}
}

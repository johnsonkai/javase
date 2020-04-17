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
 * DataInputStream��DataOutPutStream�����������ר�Ŷ�дprimitive ��string���͵�����
 * 1:�������̳й�ϵ���̳����ֽڰ�װ��ĸ���FilterInputStream,FilterOutputStream
 *  DataOutputStream extends FilterOutputStream implements DataOutput
 *  class DataInputStream extends FilterInputStream implements DataInput
 *  2:������ֻ�д�InputStream OutputStream���͵Ĺ��췽��
 *  3:���������밴��д��˳�򣬶�����Ӧ������
 *  4.��ò�Ҫ�ڶ�дprimitive�����У������õ�����write��read�������ж�д������
 * @author Administrator
 *
 */
public class DataIoDemo {
	public static void main(String[] args) throws IOException {
		writePrStrIntoFile(new File("src/cn/ck/io/data.txt"));//��������Դ���һ�������ڵ�Ŀ¼��ǰ��Ŀ¼������ڡ�
		readPrStrFromFile(new File("src/cn/ck/io/data.txt"));
	}
	/**
	 * �������������ݣ�string�������ݴ�����ڴ���ֽ������У��ֽ���������
	 * @throws IOException 
	 * @ param f:��ʾ�洢�������ͺ��ַ��������ݵ��ļ�����
	 */
	public static void writePrStrIntoFile(File f) throws IOException{
		DataOutputStream dos =new DataOutputStream(new FileOutputStream(f));
		dos.writeInt(5);
		dos.writeBoolean(true);
		dos.writeUTF("dfdsfs");
		dos.write("dssdsdf".getBytes());//��ò�Ҫ��write������writeint��Щ�������ʹ�á�
		dos.writeChar('c');
		dos.writeFloat(5.3f);
		dos.writeDouble(45.6);
		dos.writeByte(5);
		dos.writeShort(34);
		
		dos.close();
	}
	
	/**
	 * 
	 * @param f ������ݵ��ļ�
	 * @throws IOException 
	 */
	public static void readPrStrFromFile(File f) throws IOException{
		DataInputStream dis=new DataInputStream(new FileInputStream(f));
		int a=dis.readInt();
		Boolean bool=dis.readBoolean();
		String str=dis.readUTF();
		byte[] b1=new byte[7];//����ָ�������ֽ�����������׼ȷ�ģ���Ȼ���������ݵ��ֽڶ�����
		System.out.println(new String(b1,0,dis.read(b1)));
		char c=dis.readChar();
		System.out.println(c);
		
		
		
	}
}

package cn.ck.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * 序列流SequenceInputStream,对多个流进行合并
 * 即是读完第一个流再读第二个流,一直读完所有的流，可以对文件进行合并操作
 * 构造函数
*SequenceInputStream(InputStream s1, InputStream s2)
*SequenceInputStream(InputStream s1, InputStream s2)
 * @author Administrator
 *下面案例就是对文件进行分割备份，然后再合并的操作。
 */

public class SequenceInputStreamDemo {
	public static void main(String[] args) throws IOException {
		File src=new File("F:\\demo\\io\\io.docx");
		File target=new File("F:\\demo\\io\\split");
		splitFile(src,target);
		//通过切割文件存放的目录获取所有的切割备份文件
		File [] fileList=target.listFiles();
		//将分割的文件按分割的顺序存创建文件流，并将流放在set集合中
		LinkedHashSet<InputStream> sets=new LinkedHashSet<InputStream>();
		for(File f:fileList){
			System.out.println(f);
			InputStream fis=new FileInputStream(f);
			sets.add(fis);
		}
		//合并文件
		mergeFilie(new File("F:\\demo\\io\\meger\\io.docx"), sets);
	}
	/**
	 * 
	 * @param dest合并文件存放的目录
	 * @param sets 字节输入文件流set集合
	 * @throws IOException 
	 */
	public static void mergeFilie(File dest, LinkedHashSet<InputStream> sets) throws IOException{
		final Iterator<InputStream> it=sets.iterator();
		OutputStream fos=null;
		SequenceInputStream sis=null;
		try {
			fos=new FileOutputStream(dest);
			sis=new SequenceInputStream(new Enumeration<InputStream>() {

				@Override
				public boolean hasMoreElements() {
					// TODO Auto-generated method stub
					
					return it.hasNext();
				}

				@Override
				public InputStream nextElement() {
					// TODO Auto-generated method stub
					return it.next();
				}
				
			});
		int len=0;
		byte b[] =new byte[1024*10];
		while((len=sis.read(b))!=-1){
			fos.write(b, 0, len);
		}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			sis.close();
			fos.close();
		}
		
		
		
	}
	/**
	 * 
	 * @param sr 需要分割的文件
	 * @param dest 分割后的文件所在的目录
	 */
	public static void splitFile(File src,File dest){
		//判断源文件是否存在
		if(!src.exists()||!src.isFile()){
			System.out.println("被切割的必须是文件且存在。");
			return;
		}
		//判断目标目录是否存在
		if(!dest.exists()||!dest.isDirectory()){
			System.out.println("接受分件的目标目录必须存在。");
			return;
		}
		InputStream fis=null;
		OutputStream fos =null;
		//分割的文件大小为4k
		try {
			fis=new FileInputStream(src);
			byte [] fileSize=new byte[1024*20];
			int len=0;
			int count=1;
			while((len=fis.read(fileSize))!=-1){
				fos=new FileOutputStream(new File(dest ,src.getName()+"_part"+count));
				fos.write(fileSize,0,len);
				count++;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				fos.close();
				fis.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}

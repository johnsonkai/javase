package cn.ck.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/**
 * 字节输入输出流使用案例
 * 使用文件字节流，实现文件或文件夹的复制,如果目标文件夹存在该目录或文件，提醒已存在该目录文件不能复制).
 * @author Administrator
 *
 */
public class InputStreamDemo {
	public static void main(String[] args) {
		File f= new File("D:/demo/");
		File dest=new File("F:/");
		cutFile(f,dest);
	}
	/**
	 * 用字节文件流实现文件剪切
	 * @param src 要剪切的文件或文件夹
	 * @param dest 剪切到的文件夹
	 */
	public static void cutFile(File src,File dest){
		if(!src.exists()||!dest.exists()){
			System.out.println("源目录或目标目录不存在");
		}
		if(dest.isFile()){
			System.out.println("只能将文件或目录复制到另一个目录下");
		}
		//如果要复制文件，只需要在目标目录下新建一个原文件名的file对象，然后将原文件内容用流读入file对象中。
		String fileName=src.getName();
		dest=new File(dest,fileName);
		if(src.isFile()){
			/*try {
				//dest.createNewFile();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}*/
			InputStream fis=null;
			OutputStream fos=null;
			try {
				fis=new FileInputStream(src);
				fos=new FileOutputStream(dest);
				byte b[]=new byte[1024];
				int len=0;
				while(( len=fis.read(b))!=-1){
					fos.write(b, 0, len);
				}
				src.delete();//源文件已经复制到目标目录可以删除源文件了
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally{
				try {
					fis.close();
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
			
		} else if(src.isDirectory()){
			dest.mkdir();//目标文件夹必须创建,FileOutputStream。
			File [] fileLists=src.listFiles();
			for(File f:fileLists){
				if(f.isFile()){
					cutFile(f, dest);
				} else if(f.isDirectory()){
					//dest=new File(dest,f.getName());
					//dest.mkdirs();
					cutFile(f, dest);
				}
			}
		}
		System.out.println(src.delete());//所有的文件已经删除，可以直接删除源file对象所设置的目录.
	
		
	}
	public static void  copyFile(File src, File dest){
		
		if(!src.exists()||!dest.exists()){
			System.out.println("源目录或目标目录不存在");
		}
		if(dest.isFile()){
			System.out.println("只能将文件或目录复制到另一个目录下");
		}
		//如果要复制文件，只需要在目标目录下新建一个原文件名的file对象，然后将原文件内容用流读入file对象中。
		String fileName=src.getName();
		dest=new File(dest,fileName);
		if(src.isFile()){
			/*try {
				//dest.createNewFile();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}*/
			InputStream bis=null;
			OutputStream bos=null;
			try {
				bis=new BufferedInputStream(new FileInputStream(src));
				bos=new BufferedOutputStream(new FileOutputStream(dest));
				int len=0;
				while(( len=bis.read())!=-1){
					bos.write(len);
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally{
				try {
					bis.close();
					bos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		} else if(src.isDirectory()){
			dest.mkdir();
			File [] fileLists=src.listFiles();
			for(File f:fileLists){
				if(f.isFile()){
					copyFile(f, dest);
				} else if(f.isDirectory()){
					//dest=new File(dest,f.getName());
					//dest.mkdir();
					copyFile(f, dest);
				}
			}
		}
		
	}
}

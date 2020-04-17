package cn.com.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileUtil {
	private FileUtil(){
		
	}
	public static void copyFile(File src,File des) throws IOException{
		if(!des.isDirectory()){
			throw new IOException("���Ƶ�Ŀ�ĵر�����Ŀ¼");
		}
		if(src.exists()){
			if(src.isFile()){
				BufferedInputStream bis =null;
				BufferedOutputStream bos = null;
				bis = new BufferedInputStream(new FileInputStream(src));
				bos = new BufferedOutputStream(new FileOutputStream(new File(des,src.getName())));
				
				byte data [] = new byte [1024];
				int len =-1;
				while((len=bis.read(data))!=-1){
					bos.write(data);
				}
				FileUtil.closeAll(bis,bos);
			}
			else{
				throw new IOException("ֻ��copy�ļ�");
			}
		}
		
	}
	public static void closeAll(Closeable ...io){
		for(Closeable temp:io){
			if(temp!=null){
				try {
					temp.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	public static void copyFolder(File src ,File des) throws IOException{
		if(!des.isDirectory()){
			throw new IOException("���ܱ����Ƶ�Ŀ¼������Ŀ¼");
		}
		if(src.isDirectory()){
			des.mkdirs();
			for(File f:src.listFiles()){
				System.out.println(f.getName());
				if(f.isFile()){
					copyFile(f, des);
				}
				if(f.isDirectory()){
					new File(des,f.getName()).mkdirs();
					copyFolder(f, new File(des,f.getName()));
				}
				
			}
			
			
		}else{
			throw new IOException("ֻ��copyĿ¼");
		}
	}
}

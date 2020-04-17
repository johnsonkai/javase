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
 * �ֽ����������ʹ�ð���
 * ʹ���ļ��ֽ�����ʵ���ļ����ļ��еĸ���,���Ŀ���ļ��д��ڸ�Ŀ¼���ļ��������Ѵ��ڸ�Ŀ¼�ļ����ܸ���).
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
	 * ���ֽ��ļ���ʵ���ļ�����
	 * @param src Ҫ���е��ļ����ļ���
	 * @param dest ���е����ļ���
	 */
	public static void cutFile(File src,File dest){
		if(!src.exists()||!dest.exists()){
			System.out.println("ԴĿ¼��Ŀ��Ŀ¼������");
		}
		if(dest.isFile()){
			System.out.println("ֻ�ܽ��ļ���Ŀ¼���Ƶ���һ��Ŀ¼��");
		}
		//���Ҫ�����ļ���ֻ��Ҫ��Ŀ��Ŀ¼���½�һ��ԭ�ļ�����file����Ȼ��ԭ�ļ�������������file�����С�
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
				src.delete();//Դ�ļ��Ѿ����Ƶ�Ŀ��Ŀ¼����ɾ��Դ�ļ���
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
			dest.mkdir();//Ŀ���ļ��б��봴��,FileOutputStream��
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
		System.out.println(src.delete());//���е��ļ��Ѿ�ɾ��������ֱ��ɾ��Դfile���������õ�Ŀ¼.
	
		
	}
	public static void  copyFile(File src, File dest){
		
		if(!src.exists()||!dest.exists()){
			System.out.println("ԴĿ¼��Ŀ��Ŀ¼������");
		}
		if(dest.isFile()){
			System.out.println("ֻ�ܽ��ļ���Ŀ¼���Ƶ���һ��Ŀ¼��");
		}
		//���Ҫ�����ļ���ֻ��Ҫ��Ŀ��Ŀ¼���½�һ��ԭ�ļ�����file����Ȼ��ԭ�ļ�������������file�����С�
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

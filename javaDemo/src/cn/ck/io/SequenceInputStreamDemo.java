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
 * ������SequenceInputStream,�Զ�������кϲ�
 * ���Ƕ����һ�����ٶ��ڶ�����,һֱ�������е��������Զ��ļ����кϲ�����
 * ���캯��
*SequenceInputStream(InputStream s1, InputStream s2)
*SequenceInputStream(InputStream s1, InputStream s2)
 * @author Administrator
 *���永�����Ƕ��ļ����зָ�ݣ�Ȼ���ٺϲ��Ĳ�����
 */

public class SequenceInputStreamDemo {
	public static void main(String[] args) throws IOException {
		File src=new File("F:\\demo\\io\\io.docx");
		File target=new File("F:\\demo\\io\\split");
		splitFile(src,target);
		//ͨ���и��ļ���ŵ�Ŀ¼��ȡ���е��и���ļ�
		File [] fileList=target.listFiles();
		//���ָ���ļ����ָ��˳��洴���ļ���������������set������
		LinkedHashSet<InputStream> sets=new LinkedHashSet<InputStream>();
		for(File f:fileList){
			System.out.println(f);
			InputStream fis=new FileInputStream(f);
			sets.add(fis);
		}
		//�ϲ��ļ�
		mergeFilie(new File("F:\\demo\\io\\meger\\io.docx"), sets);
	}
	/**
	 * 
	 * @param dest�ϲ��ļ���ŵ�Ŀ¼
	 * @param sets �ֽ������ļ���set����
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
	 * @param sr ��Ҫ�ָ���ļ�
	 * @param dest �ָ����ļ����ڵ�Ŀ¼
	 */
	public static void splitFile(File src,File dest){
		//�ж�Դ�ļ��Ƿ����
		if(!src.exists()||!src.isFile()){
			System.out.println("���и�ı������ļ��Ҵ��ڡ�");
			return;
		}
		//�ж�Ŀ��Ŀ¼�Ƿ����
		if(!dest.exists()||!dest.isDirectory()){
			System.out.println("���ּܷ���Ŀ��Ŀ¼������ڡ�");
			return;
		}
		InputStream fis=null;
		OutputStream fos =null;
		//�ָ���ļ���СΪ4k
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

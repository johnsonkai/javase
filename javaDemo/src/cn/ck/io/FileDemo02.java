package cn.ck.io;

import java.io.File;

/**
 * �õݹ��˼���rename����ʵ���ļ��еļ���
 * @author Administrator
 *
 */
public class FileDemo02 {
	public static void main(String[] args) {
		File src=new File("F:/Program Files/java2/javaDoc/io");
		File des=new File("D:/demo");
		File temp=new File("D:/demo/demos");
		deleteDir(temp);
		//System.out.println(temp.delete());
		//cutFolder(src, des);
	}
	/**
	 * 
	 * renameTo����ֻ���޸��ƶ��ļ����޸��ļ����������ƶ�Ŀ¼���÷������ƶ�����ָ��Ŀ¼
	 * @param src ԴĿ¼����Ҫ���е�Ŀ¼
	 * @param des  Ŀ��Ŀ¼������ԴĿ¼��Ŀ¼��
	 */
	public  static void cutFolder(File src ,File des){
		if(!src.exists()||!des.exists()){
			System.out.println("������Ŀ¼������");
			return;
		}
		if(!src.isDirectory()||!des.isDirectory()){
			System.out.println("�����Ĳ���Ŀ¼");
			return;
		}
		des=new File(des,src.getName());//��ԴĿ¼��Ŀ¼������ΪĿ��Ŀ¼����Ŀ¼����
		des.mkdir();//����Ŀ��Ŀ¼
		File [] fileList=src.listFiles();//��ȡԴĿ¼����Ŀ¼�����ļ�
		//����ԴĿ¼����file���������Ŀ¼��ݹ����cufFoler,������ļ������ļ��ƶ�Ŀ��Ŀ¼��
		for(File f:fileList){
			if(f.isDirectory()){
				cutFolder(f, des);
			} else if(f.isFile()){
				f.renameTo(new File(des,f.getName()));//�ļ��ƶ���Ŀ��Ŀ¼��,��renameTo������Ҫָ����Ŀ���ļ�����
			}
		}
		src.delete();//�ļ��Ѿ�ȫ���Ƴ�������ֱ��ɾ��ԴĿ¼
	}
	/**
	 * ɾ��ָ���ķǿ�Ŀ¼��
	 * @param dir��Ҫɾ����Ŀ¼
	 * delete��������ֱ��ɾ���ǿ�Ŀ¼��
	 */
	public static void deleteDir(File dir){
		if(!dir.exists()){
			System.out.println("·��������");
			return;
		} 
		if(!dir.isDirectory()){
			System.out.println("����Ŀ¼");
			return;
		}
		File [] fileList=dir.listFiles();//��ȡ��Ҫɾ��Ŀ¼����Ŀ¼�����ļ�;
		//�������е����ļ���Ŀ¼��������ļ�ֱ��ɾ������Ŀ¼�ݹ���ø÷�����ֱ�����б������е���Ŀ¼�����ļ��������е����ļ���ɾ����Ȼ��Ϳ���ɾ��Ŀ¼
		for (File f:fileList) {
			if(f.isFile()){
				f.delete();
			} else if(f.isDirectory()){
				deleteDir(f);
			}
		}
		dir.delete();//Ŀ¼Ϊ�տ���ֱ��ɾ��Ŀ¼�ˡ�
	}
	
}

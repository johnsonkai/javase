package cn.ck.io;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;

public class FileDemo {
	public static void main(String[] args) {
		//File f =new File("F:/workspaces/JavaDemo/src/cn/ck/io/testFiel/bb.txt");
		//System.out.println(f.renameTo(new File("D:/bb1.txt")));
		//showAllChilidFile(new File("F:/workspaces/JavaDemo/"));
		//showAllChidFileBySub(new File("F:/workspaces/JavaDemo/"), ".java");
		showAllChilidFileByTree(new File("F:/workspaces/JavaDemo/"), "|--");
		
	}
	/**�г�ָ��Ŀ¼ָ����׺�������������ļ�,Ŀ¼*/
	public static void showAllChidFileBySub(File f,String sub){
		if(f.isDirectory()){
			
			File [] files=f.listFiles();
			for(File file:files){
				/*if(file.getName().endsWith(".java")){
					System.out.println(file.getName());
				}*/
				if(file.isDirectory()){
					File [] filess=file.listFiles(new FilenameFilter() {
						
						@Override
						public boolean accept(File dir, String name) {
							// TODO Auto-generated method stub
							return name.endsWith(".java");
						}
					});
					if(filess!=null&&filess.length>0){
						for(File ff:filess){
							System.out.println(ff.getName());
						}
					}
					showAllChidFileBySub(file, ".java");
				} else if(file.isFile()){
						File [] filess=file.listFiles(new FilenameFilter() {
						
						@Override
						public boolean accept(File dir, String name) {
							// TODO Auto-generated method stub
							return name.endsWith(".java");
						}
						});
						if(filess!=null&&filess.length>0){
							for(File ff:filess){
								System.out.println(ff.getName());
							}
						}
				}
				
			}
			
			
		} 
	}
	
	/**�г�ָ��Ŀ¼���е����ļ�����Ŀ¼(���в㼶�����ļ�����Ŀ¼)*/
	public static void showAllChilidFile(File f){
		if(f.isDirectory()){
			File [] files=f.listFiles();
			for(File file:files){
				if(file.isDirectory()){
					System.out.println(file.getName());
					showAllChilidFile(file);
				} else if(file.isFile()){
					System.out.println(file.getName());
				} else{
					System.out.println("��file������Ч");
				}
			}
		} else{
			System.out.println("���벻��Ŀ¼��·��Ϊ��"+f.getAbsolutePath());
		}
	}
	
	/**��״�г�ָ��Ŀ¼���е����ļ�����Ŀ¼(���в㼶�����ļ�����Ŀ¼)*/
	public static void showAllChilidFileByTree(File f,String str){
		if(f.isDirectory()){
			File [] files=f.listFiles();
			for(File file:files){
				if(file.isDirectory()){
					System.out.println(str+file.getName());
					showAllChilidFileByTree(file, "| "+str);
				} else if(file.isFile()){
					System.out.println(str+file.getName());
				} else{
					System.out.println("��file������Ч");
				}
			}
		} else{
			System.out.println("���벻��Ŀ¼��·��Ϊ��"+f.getAbsolutePath());
		}
	}
	
	/**�г�ָ��Ŀ¼���е����ļ�����Ŀ¼���ֿ��г�*/
	public static void showChildFileDirBySep(File f){
		ArrayList<File> dirList=new ArrayList<File>();
		ArrayList<File> fileList=new ArrayList<File>();
		if(f.isDirectory()){
			File [] files=f.listFiles();
			
			for(File file:files){
				if(file.isDirectory()){
					dirList.add(file);
					
				} else if(file.isFile()){
					fileList.add(file);
				} else{
					System.out.println("��file������Ч");
				}
			}
		} else{
			System.out.println("���벻��Ŀ¼��·��Ϊ��"+f.getAbsolutePath());
		}
		//�ֱ������Ŀ¼�����ļ�����
		System.out.println("��Ŀ¼���£�");
		for(File fs:dirList){
			
			System.out.println(fs.getName());
		}
		System.out.println("���ļ����£�");
		for(File fs:fileList){
			
			System.out.println(fs.getName());
		}
	}
	
	
}

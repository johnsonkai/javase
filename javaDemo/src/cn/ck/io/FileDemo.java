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
	/**列出指定目录指定后缀名的所有子孙文件,目录*/
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
	
	/**列出指定目录所有的子文件跟子目录(所有层级的子文件跟子目录)*/
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
					System.out.println("该file对象无效");
				}
			}
		} else{
			System.out.println("输入不是目录，路径为："+f.getAbsolutePath());
		}
	}
	
	/**树状列出指定目录所有的子文件跟子目录(所有层级的子文件跟子目录)*/
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
					System.out.println("该file对象无效");
				}
			}
		} else{
			System.out.println("输入不是目录，路径为："+f.getAbsolutePath());
		}
	}
	
	/**列出指定目录所有的子文件跟子目录，分开列出*/
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
					System.out.println("该file对象无效");
				}
			}
		} else{
			System.out.println("输入不是目录，路径为："+f.getAbsolutePath());
		}
		//分别变量子目录，子文件对象
		System.out.println("子目录如下：");
		for(File fs:dirList){
			
			System.out.println(fs.getName());
		}
		System.out.println("子文件如下：");
		for(File fs:fileList){
			
			System.out.println(fs.getName());
		}
	}
	
	
}

package cn.ck.io;

import java.io.File;

/**
 * 用递归的思想和rename方法实现文件夹的剪切
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
	 * renameTo方法只能修改移动文件，修改文件名。不能移动目录，该方法是移动剪切指定目录
	 * @param src 源目录，需要剪切的目录
	 * @param des  目标目录，接受源目录的目录。
	 */
	public  static void cutFolder(File src ,File des){
		if(!src.exists()||!des.exists()){
			System.out.println("操作的目录不存在");
			return;
		}
		if(!src.isDirectory()||!des.isDirectory()){
			System.out.println("操作的不是目录");
			return;
		}
		des=new File(des,src.getName());//将源目录的目录名，作为目标目录的子目录名。
		des.mkdir();//创建目标目录
		File [] fileList=src.listFiles();//获取源目录的子目录或子文件
		//遍历源目录的子file对象，如果是目录则递归调用cufFoler,如果是文件，将文件移动目标目录。
		for(File f:fileList){
			if(f.isDirectory()){
				cutFolder(f, des);
			} else if(f.isFile()){
				f.renameTo(new File(des,f.getName()));//文件移动到目标目录下,用renameTo方法需要指定中目标文件对象，
			}
		}
		src.delete();//文件已经全部移除，可以直接删除源目录
	}
	/**
	 * 删除指定的非空目录。
	 * @param dir需要删除的目录
	 * delete方法不能直接删除非空目录的
	 */
	public static void deleteDir(File dir){
		if(!dir.exists()){
			System.out.println("路径不存在");
			return;
		} 
		if(!dir.isDirectory()){
			System.out.println("不是目录");
			return;
		}
		File [] fileList=dir.listFiles();//获取需要删除目录的子目录跟子文件;
		//遍历所有的子文件或目录，如果是文件直接删除，是目录递归调用该方法，直到所有遍历所有的子目录，子文件，将所有的子文件都删除，然后就可以删除目录
		for (File f:fileList) {
			if(f.isFile()){
				f.delete();
			} else if(f.isDirectory()){
				deleteDir(f);
			}
		}
		dir.delete();//目录为空可以直接删除目录了。
	}
	
}

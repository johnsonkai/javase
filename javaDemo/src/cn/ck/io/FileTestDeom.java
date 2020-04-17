package cn.ck.io;

import java.io.File;
import java.io.IOException;
/**
 * file对象的crd操作，加上判断的一些方法
 * @author Administrator
 *
 */
public class FileTestDeom {
	public static void main(String[] args) throws IOException {
		File f=new File("D:/demo/io/demo/ming.txt");//必须指定文件名;
		File moveFile=new File("D:/demo/io/demo/demott/tt.txt");//指定目录
		File dest=new File("D:/demo/io/demo/tt.txt");//必须指定文件名;
		File dir=new File("D:/demo/io/demo/demott");//指定目录
		File renameDir=new File("D:/demo/io/demo/demottt");//指定目录
		File dirs=new File("D:/demo/io/demo/demoss/demots");//指定目录(多级)
		//file对象创建文件，目录，文件，重新命名操作，file对象的c操作。
		/*System.out.println(f.createNewFile());//创建一个空不存在的文件，成功返回true，失败返回false;
		System.out.println(dir.mkdir());//只能一级一级创建目录，创建成功返回true，失败返回false；
		System.out.println(dirs.mkdirs());//多级目录创建，创建成功返回true，失败返回false；
		//renameTo方法能重命名文件名或者目录，命名文件，如果二个file对象路径一样，就是重命名，如果二个file对象路径不一样就是文件移动
		System.out.println(f.renameTo(dest));//重命名文件名
		System.out.println(dest.renameTo(moveFile));//移动文件
		System.out.println(dir.renameTo(renameDir));//重命名目录名
*/		//file对象的d操作删除操作delete
		f.delete();//delete方法只能删除文件或者为空的文件夹。
		//file一些判断操作，如(isFile isDiretory，exists，这三种常用不详细说了)，isHidden是否是隐藏文件夹，文件,isAbsolute是否是绝对路径定义的file对象
		System.out.println();f.isHidden();
		f.isAbsolute();
		//file 一些r查询操作，
		File parent =f.getParentFile();//得到父file对象
		System.out.println(parent.toString());
		System.out.println(f.getParent());//得到父file对象的路径
		System.out.println(f.getName());//获取file对象的名称
		System.out.println(f.getPath());//得到file对象的路径
		//一些获取file子对象（路径）的方法list(),fileList();在其他代码已经用过了。
		
	}
}

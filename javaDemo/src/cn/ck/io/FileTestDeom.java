package cn.ck.io;

import java.io.File;
import java.io.IOException;
/**
 * file�����crd�����������жϵ�һЩ����
 * @author Administrator
 *
 */
public class FileTestDeom {
	public static void main(String[] args) throws IOException {
		File f=new File("D:/demo/io/demo/ming.txt");//����ָ���ļ���;
		File moveFile=new File("D:/demo/io/demo/demott/tt.txt");//ָ��Ŀ¼
		File dest=new File("D:/demo/io/demo/tt.txt");//����ָ���ļ���;
		File dir=new File("D:/demo/io/demo/demott");//ָ��Ŀ¼
		File renameDir=new File("D:/demo/io/demo/demottt");//ָ��Ŀ¼
		File dirs=new File("D:/demo/io/demo/demoss/demots");//ָ��Ŀ¼(�༶)
		//file���󴴽��ļ���Ŀ¼���ļ�����������������file�����c������
		/*System.out.println(f.createNewFile());//����һ���ղ����ڵ��ļ����ɹ�����true��ʧ�ܷ���false;
		System.out.println(dir.mkdir());//ֻ��һ��һ������Ŀ¼�������ɹ�����true��ʧ�ܷ���false��
		System.out.println(dirs.mkdirs());//�༶Ŀ¼�����������ɹ�����true��ʧ�ܷ���false��
		//renameTo�������������ļ�������Ŀ¼�������ļ����������file����·��һ�����������������������file����·����һ�������ļ��ƶ�
		System.out.println(f.renameTo(dest));//�������ļ���
		System.out.println(dest.renameTo(moveFile));//�ƶ��ļ�
		System.out.println(dir.renameTo(renameDir));//������Ŀ¼��
*/		//file�����d����ɾ������delete
		f.delete();//delete����ֻ��ɾ���ļ�����Ϊ�յ��ļ��С�
		//fileһЩ�жϲ�������(isFile isDiretory��exists�������ֳ��ò���ϸ˵��)��isHidden�Ƿ��������ļ��У��ļ�,isAbsolute�Ƿ��Ǿ���·�������file����
		System.out.println();f.isHidden();
		f.isAbsolute();
		//file һЩr��ѯ������
		File parent =f.getParentFile();//�õ���file����
		System.out.println(parent.toString());
		System.out.println(f.getParent());//�õ���file�����·��
		System.out.println(f.getName());//��ȡfile���������
		System.out.println(f.getPath());//�õ�file�����·��
		//һЩ��ȡfile�Ӷ���·�����ķ���list(),fileList();�����������Ѿ��ù��ˡ�
		
	}
}

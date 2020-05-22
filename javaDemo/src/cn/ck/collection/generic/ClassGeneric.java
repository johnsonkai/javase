package cn.ck.collection.generic;
/**
 * �෺�Ͷ����ʽ�� ����<��������>
 * 1���������෺�Ͳ���������ľ�̬��Ա��������̬��Ա�����У���Ϊ�෺���ڴ�������ʱȷ�����������ͣ�����̬��Ա���ڶ��󴴽�֮ǰ�ʹ�����
 * ��Ա���������Զ��巽������������������.
 * 2����������ʹ��ʱ(������������̳и���)ָ�����͵ľ�������
 *:3�����ڴ�������ʱ��û��ָ���������ͣ�Ĭ����Object���͡�
 * û��ָ��ָ����  ������������ʱû��ָ�����͵����ͣ�������new ����ʱ��û��ָ������������
 * ClassGeneric cg=new ClassGeneric<String>();//δָ��
 * ClassGeneric cg=new ClassGeneric//δָ��
 * ClassGeneric<String> cg=new ClassGeneric//ָ��
 * 4:����ڴ�������ʱָ�����͵ľ������ͣ���ô�ö�������йط��͵����ԣ���������������������͡�
 * 5:�ȿ��������෺�ͣ�ͬʱҲ�������������ͣ�������������һ����
 * 6���ӿڷ��͸��෺��ʹ�ò�࣬�Ͳ��ظ�������
 * @author Administrator
 *
 * @param <T>
 */
public class ClassGeneric<T> {
	T desc;
	//static T t1;
	public T getDesc() {
		return desc;
	}

	public void setDesc(T desc) {
		this.desc = desc;
	}
	
	/*public static void getT(T t){
		System.out.println(t);
	}*/
	//�Զ��巽������
	public static <T> void getT(T t){
		System.out.println(t);
	}
	
	public static void main(String[] args) {
		ClassGeneric cg=new ClassGeneric<String>();
		cg.setDesc("�����Ǹ��ö���");
		System.out.println(cg.desc);
		getT(cg.desc);
		ChildGeneric1 child1=new ChildGeneric1();
		child1.getT("����");
		ChildGeneric2<String> child2=new ChildGeneric2<String>();
		child2.getT("����");
		
	}
	

}
//֪����������ͣ�����ָ���ض�������,�ڴ����������ʱ����Ҫָ����������
 class ChildGeneric1 extends ClassGeneric<String>{
	 
	 public void getT(String t){
		System.out.println("��������:"+t);
	 }
 }
 //��֪����������ͣ����������������
 class ChildGeneric2<T> extends ClassGeneric<T>{
	 public void getT(T t){
			System.out.println("��������2:"+t);
		 }
 }

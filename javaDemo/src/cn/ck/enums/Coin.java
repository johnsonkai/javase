package cn.ck.enums;
/**
 * ��ö�����ж�����ͨ��Ա��������Ա���������췽�����Լ�ö�����ͳ�Ա������
 * ö�����͵�ö�ٳ����������� final static������ö�����͵�һ��ʵ����һ������,���ö�������ж��ö�ٳ�����ö�ٳ�����,�Ÿ���,���һ��ö��������;����ö�ٳ������塣
 * ö�����͵Ĺ��췽����˽�еģ����췽������в���,��ôö�ٳ���Ҳ��������Ӧ�Ĳ���,����������вεĹ��췽��,��û�ж���һ���޲ι��죬���Ƕ���ö�ٳ���û�д�������ᱨ��
 * ö�ٱ���Ҳ��һ��java�࣬���Զ�����ͨjava��ĳ�Ա��������Ա���������췽������Ȼö�����Ͳ�������ö�����ͣ�������ù��췽����
 * @author Administrator
 *
 */
public enum Coin {
	SMALL(4,"��ɫ"), MID(8,"��ɫ"),SINGLEBIG(10),BIG(12,"��ɫ");//���Ĭ��Ϊ0,1,2...,������SMALL����0
	
	private int size;
	private String color;
	private Coin(int size,String color){
		this.size=size;
		this.color=color;
	}
	private Coin(int size){
		this.size=size;
		
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public void showCoinSize(){
		System.out.println("Ӳ�Ҵ�СΪ"+size+",Ӳ����ɫΪ"+color);
	}
	
	
}

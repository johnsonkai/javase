package cn.ck.enums;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 
 * @author Administrator
 *
 */
public class TestEnum {
	public static void main(String[] args) {
		Color [] colors=Color.values();//��ȡö�����͵�����ö�ٳ���,
		Color color1=Color.valueOf("BLACK");//ͨ��ö�ٳ������ƻ�ȡö�ٳ���
		System.out.println(color1.name());
		//ö�����͵������Ĭ��Ϊ0,1,2...
		for (Color color:colors) {
			System.out.println("ö�ٳ�������Ϊ��"+color.name()+"ö�ٳ��������"+color.ordinal()+"ö�ٳ�����ö�����͵�class����"+color.getDeclaringClass()+"");
			
		}
		//����Coinö��
		Coin coin=Coin.BIG;//ö����.ö�ٳ�������ȡö�ٵ�һ������
		Coin small=Coin.SMALL;
		System.out.println(coin.compareTo(small));//compareTo���ص��ǵ��÷�����ö�ٳ������������ε�ö�ٳ���������Ĳ�ֵ��
		coin.showCoinSize();
		compareCoinSize(coin, small);
		//���Է���ö��
		EnumSet<Direct> enums = EnumSet.of(Direct.UP);
		EnumSet<Direct> enmusAll=EnumSet.allOf(Direct.class);//��һ��ö�����͵�����ö�ٳ�������set������
		
		for (Direct direct1: enmusAll) {
			System.out.println(direct1);
		}
		enums.add(Direct.LEFT);
		EnumSet<Direct> enumss= EnumSet.complementOf(enums);//����һ��set����
		System.out.println(enums.equals(enums));
		//����setö�ټ���
		for (Direct directs: enums) {
			System.out.println(directs);
		}
		Iterator<Direct> iterator = enums.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		//map����
		EnumMap<Direct, String> enumMap = new EnumMap<Direct, String>(Direct.class);
		enumMap.put(Direct.UP, "����");
		enumMap.put(Direct.DOWN, "��С");
		enumMap.put(Direct.RIGHT, "����");
		//ȡmap��key1��value
		Set<Direct> sets= enumMap.keySet();
		Set<Map.Entry<Direct, String>> entrys=enumMap.entrySet();
		for (Entry<Direct, String> entry:entrys) {
			System.out.println("��ֵΪ"+entry.getKey()+"ֵΪ"+entry.getValue());
		}
		for(Direct myset:sets){
			String value=enumMap.get(myset);
			System.out.println("��ֵΪ:"+myset+"ֵΪ:"+value);
		}
		
		
		
		
		
	}
	
	
	
	/** �Ƚ϶���Coin����ö�ٳ����������С*/
	public  static void compareCoinSize(Coin coin1,Coin coin2){
		if(coin1.getDeclaringClass()==Coin.class&&coin1.getDeclaringClass()==coin2.getDeclaringClass()){
			int sub=coin1.compareTo(coin2);
			if(sub==0){
				System.out.println(coin1.name()+"�ĳߴ����"+coin2.name());
			} else if(sub>0){
				System.out.println(coin1.name()+"�ĳߴ����"+coin2.name());
			} else{
				System.out.println(coin1.name()+"�ĳߴ�С��"+coin2.name());
			}
		} else{
			System.out.println("����ö�ٳ���������ͬһ����");
		}
	}
	
}

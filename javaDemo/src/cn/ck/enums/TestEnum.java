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
		Color [] colors=Color.values();//获取枚举类型的所有枚举常量,
		Color color1=Color.valueOf("BLACK");//通过枚举常量名称获取枚举常量
		System.out.println(color1.name());
		//枚举类型的序号数默认为0,1,2...
		for (Color color:colors) {
			System.out.println("枚举常量名称为："+color.name()+"枚举常量序号数"+color.ordinal()+"枚举常量的枚举类型的class对象："+color.getDeclaringClass()+"");
			
		}
		//测试Coin枚举
		Coin coin=Coin.BIG;//枚举类.枚举常量，获取枚举的一个对象。
		Coin small=Coin.SMALL;
		System.out.println(coin.compareTo(small));//compareTo返回的是调用方法的枚举常量序号数与入参的枚举常量序号数的差值。
		coin.showCoinSize();
		compareCoinSize(coin, small);
		//测试方向枚举
		EnumSet<Direct> enums = EnumSet.of(Direct.UP);
		EnumSet<Direct> enmusAll=EnumSet.allOf(Direct.class);//将一个枚举类型的所有枚举常量放在set集合中
		
		for (Direct direct1: enmusAll) {
			System.out.println(direct1);
		}
		enums.add(Direct.LEFT);
		EnumSet<Direct> enumss= EnumSet.complementOf(enums);//复制一个set集合
		System.out.println(enums.equals(enums));
		//遍历set枚举集合
		for (Direct directs: enums) {
			System.out.println(directs);
		}
		Iterator<Direct> iterator = enums.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		//map测试
		EnumMap<Direct, String> enumMap = new EnumMap<Direct, String>(Direct.class);
		enumMap.put(Direct.UP, "向上");
		enumMap.put(Direct.DOWN, "向小");
		enumMap.put(Direct.RIGHT, "向右");
		//取map的key1与value
		Set<Direct> sets= enumMap.keySet();
		Set<Map.Entry<Direct, String>> entrys=enumMap.entrySet();
		for (Entry<Direct, String> entry:entrys) {
			System.out.println("键值为"+entry.getKey()+"值为"+entry.getValue());
		}
		for(Direct myset:sets){
			String value=enumMap.get(myset);
			System.out.println("键值为:"+myset+"值为:"+value);
		}
		
		
		
		
		
	}
	
	
	
	/** 比较二个Coin类型枚举常量序号数大小*/
	public  static void compareCoinSize(Coin coin1,Coin coin2){
		if(coin1.getDeclaringClass()==Coin.class&&coin1.getDeclaringClass()==coin2.getDeclaringClass()){
			int sub=coin1.compareTo(coin2);
			if(sub==0){
				System.out.println(coin1.name()+"的尺寸等于"+coin2.name());
			} else if(sub>0){
				System.out.println(coin1.name()+"的尺寸大于"+coin2.name());
			} else{
				System.out.println(coin1.name()+"的尺寸小于"+coin2.name());
			}
		} else{
			System.out.println("二个枚举常量不属于同一类型");
		}
	}
	
}

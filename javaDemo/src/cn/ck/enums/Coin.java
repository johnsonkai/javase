package cn.ck.enums;
/**
 * 在枚举类中定义普通成员变量，成员方法，构造方法，以及枚举类型成员变量。
 * 枚举类型的枚举常量（常量是 final static）就是枚举类型的一个实例，一个对象,如果枚举类型有多个枚举常量，枚举常量用,号隔离,最后一个枚举类型用;结束枚举常量定义。
 * 枚举类型的构造方法是私有的，构造方法如果有参数,那么枚举常量也必须有相应的参数,如果定义了有参的构造方法,且没有定义一个无参构造，但是定义枚举常量没有传入参数会报错。
 * 枚举本身也是一个java类，可以定义普通java类的成员变量，成员方法，构造方法，虽然枚举类型不能有子枚举类型，不会调用构造方法。
 * @author Administrator
 *
 */
public enum Coin {
	SMALL(4,"白色"), MID(8,"黑色"),SINGLEBIG(10),BIG(12,"黑色");//序号默认为0,1,2...,在这里SMALL就是0
	
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
		System.out.println("硬币大小为"+size+",硬币颜色为"+color);
	}
	
	
}

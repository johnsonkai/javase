package cn.ck.enums;

import java.io.Serializable;

/**
 * 枚举类型实质是一个java类,继承了java.lang.Enum类型，该类实现了Comparable接口，Serializable接口的抽象类
 * public abstract class Enum<E extends Enum<E>>
        implements Comparable<E>, Serializable
 
 * @author Administrator
 *枚举常量就是枚举的一个实例，一个对象，枚举常量是定义是 枚举常量1，枚举常量2...枚举常量3;
 */
public  enum Color {
	BLUE,BLACK,RED;
	
}

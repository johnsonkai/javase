package cn.ck.enums;

import java.io.Serializable;

/**
 * ö������ʵ����һ��java��,�̳���java.lang.Enum���ͣ�����ʵ����Comparable�ӿڣ�Serializable�ӿڵĳ�����
 * public abstract class Enum<E extends Enum<E>>
        implements Comparable<E>, Serializable
 
 * @author Administrator
 *ö�ٳ�������ö�ٵ�һ��ʵ����һ������ö�ٳ����Ƕ����� ö�ٳ���1��ö�ٳ���2...ö�ٳ���3;
 */
public  enum Color {
	BLUE,BLACK,RED;
	
}

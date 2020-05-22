package cn.ck.proxy.cglibproxy;


import org.springframework.cglib.proxy.Enhancer;
/**
 * cglib�����ǽ��������ͨ�����ڴ湹��һ�����࣬�Ӷ�ʵ��Ŀ������ܵ���չ��Ŀ�������Ҫʵ�ֽӿڣ���Ȼʵ��Ҳ���ԣ�
 * �ŵ㣺1�������jdk��̬�����Ŀ�����һ��Ҫʵ�ֽӿڵ�ȱ�㡣
 * 2��CGLIB ��һ��ǿ��ģ������ܵĴ������ɿ⣬����������������չjava�ࡣ
 * 3��CGLIB �ײ���ʹ��С������ֽ��봦����asm,��ת���ֽ��룬���ɴ����ࡣ
 * @author Administrator
 *
 */
public class TestCgLibProxy {
	public static void main(String[] args) throws InterruptedException {
		Enhancer enhancer=new Enhancer();//����һ����ǿ��
		enhancer.setSuperclass(Plane.class);//����Ŀ�����ĸ���Ϊ������ĸ���
		Movable m= (Movable) new Plane();
		//Plane m=new Plane();
		MyInterceptor callback=new MyInterceptor(m);//�����Զ�������������
		enhancer.setCallback(callback);//���ûص�������������
		Plane proxy=(Plane) enhancer.create();//�����������
		proxy.move();
	}
}

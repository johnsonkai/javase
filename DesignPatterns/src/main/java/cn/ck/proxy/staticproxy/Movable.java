package cn.ck.proxy.staticproxy;

/**
 * 该接口用来指定代理的方法(需要增加内容的方法)，代理对象，被代理对象都该继承该接口
 * @author Administrator
 *
 */
public interface Movable {
	public void move() throws InterruptedException;
}

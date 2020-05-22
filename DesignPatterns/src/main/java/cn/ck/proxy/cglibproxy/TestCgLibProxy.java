package cn.ck.proxy.cglibproxy;


import org.springframework.cglib.proxy.Enhancer;
/**
 * cglib代理是叫子类代理，通过在内存构建一个子类，从而实现目标对象功能的扩展，目标对象不需要实现接口（当然实现也可以）
 * 优点：1：解决了jdk动态代理的目标对象一定要实现接口的缺点。
 * 2：CGLIB 是一个强大的，高性能的代码生成库，它可以在运行期扩展java类。
 * 3：CGLIB 底层是使用小而快的字节码处理框架asm,来转换字节码，生成代理类。
 * @author Administrator
 *
 */
public class TestCgLibProxy {
	public static void main(String[] args) throws InterruptedException {
		Enhancer enhancer=new Enhancer();//定义一个增强器
		enhancer.setSuperclass(Plane.class);//设置目标对象的父类为代理类的父类
		Movable m= (Movable) new Plane();
		//Plane m=new Plane();
		MyInterceptor callback=new MyInterceptor(m);//创建自定义拦截器对象
		enhancer.setCallback(callback);//设置回调对象即是拦截器
		Plane proxy=(Plane) enhancer.create();//创建代理对象
		proxy.move();
	}
}

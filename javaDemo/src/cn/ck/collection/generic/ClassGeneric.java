package cn.ck.collection.generic;
/**
 * 类泛型定义格式： 类名<泛型声明>
 * 1：声明的类泛型不能用在类的静态成员方法，静态成员属性中，因为类泛型在创建对象时确定真正的类型，而静态成员是在对象创建之前就存在了
 * 成员方法可以自定义方法泛型来解决这个问题.
 * 2：型类是在使用时(创建对象，子类继承父类)指定泛型的具体类型
 *:3：当在创建对象时，没有指定泛型类型，默认是Object类型。
 * 没有指定指的是  定义对象的类型时没有指定泛型的类型，而不是new 对象时，没有指定泛型类型如
 * ClassGeneric cg=new ClassGeneric<String>();//未指定
 * ClassGeneric cg=new ClassGeneric//未指定
 * ClassGeneric<String> cg=new ClassGeneric//指定
 * 4:如果在创建对象时指定泛型的具体类型，那么该对象操作有关泛型的属性，方法，都是这个具体类型。
 * 5:既可以声明类泛型，同时也能声明方法泛型，泛型名都可以一样。
 * 6：接口泛型跟类泛型使用差不多，就不重复测试了
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
	//自定义方法泛型
	public static <T> void getT(T t){
		System.out.println(t);
	}
	
	public static void main(String[] args) {
		ClassGeneric cg=new ClassGeneric<String>();
		cg.setDesc("泛型是个好东西");
		System.out.println(cg.desc);
		getT(cg.desc);
		ChildGeneric1 child1=new ChildGeneric1();
		child1.getT("您好");
		ChildGeneric2<String> child2=new ChildGeneric2<String>();
		child2.getT("您好");
		
	}
	

}
//知道子类的类型，子类指定特定的类型,在创建子类对象时不需要指定具体类型
 class ChildGeneric1 extends ClassGeneric<String>{
	 
	 public void getT(String t){
		System.out.println("泛型子类:"+t);
	 }
 }
 //不知道子类的类型，子类继续声明泛型
 class ChildGeneric2<T> extends ClassGeneric<T>{
	 public void getT(T t){
			System.out.println("泛型子类2:"+t);
		 }
 }

package cn.ck.singleton;

/**
 * 饿汉式单例模式：类加载的时候就创建实例
 * 优点：线程安全，类加载时就创建实例，调用效率高
 * 缺点：不能延迟加载，影响系统性能
 */
public class EagerSingleton {
/*    //jvm加载类时，就创建实例
    private static EagerSingleton singleton = new EagerSingleton();
    */

    private static EagerSingleton singleton=null;
    //在静态代码块中，创建实例,静态块与类同时被jvm加载的
    static {
        singleton = new EagerSingleton();
        //私有构造方法
    }
    private EagerSingleton(){}

    //提供一个静态方法给外部调用，获取该单例实例
    public static EagerSingleton getInstance(){
        return singleton;
    }

}

package cn.ck.singleton;

/**
 * 懒汉式单例模式：使用时才创建实例
 * 分线程安全单例模式，线程不安全单例模式
 * 线程安全懒汉式：
 * 优点：延迟加载，线程安全，
 * 缺点：执行效率低。
 * 线程不安全懒汉式：
 * 优点：延迟加载，
 * 缺点：线程安全
 */
public class LazySingleton {

    private static LazySingleton singleton;
    //私有构造方法
    private LazySingleton(){}
    //1.线程不安全的的懒汉式单例，提供一个非同步的方法，给外部使用者调用，不推荐使用
    /*public static LazySingleton getInstance(){
        if(singleton==null){
            singleton=new LazySingleton();
        }
        return singleton;
    }*/
    //2.线程不安全的的懒汉式单例同步块，只是单检验锁，依然可能创建多个实例
   /* public static LazySingleton getInstance(){
        if(singleton==null){
            synchronized (LazySingleton.class){
                singleton=new LazySingleton();
            }

        }
        return singleton;
    }*/
    // 线程安全的懒汉式：为了解决线程安全，提供一个同步静态方法，给外部使用者调用，但是调用效率低下
    public static synchronized LazySingleton getInstance(){
        if(singleton==null){
            singleton=new LazySingleton();
        }
        return singleton;
    }



}
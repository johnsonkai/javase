package cn.ck.singleton;

/**
    * 双重检验锁单例模式：实例变量用volatile进行锁定，保证不同线程对实例变量是可见的,再用同步代码块保证创建的实例是单例，可以推荐使用
    * 优点：线程安全，可延迟加载
    * 缺点：调用效率不是很高，但比饿汉式同步方法进行锁定的效率要高。
    */
public class DoubleLockSingleton {
    //volatile修饰实例,1:使得不同线程对该实例是可见的，禁止进行指令重排序
    private static volatile  DoubleLockSingleton singleton;
    //私有的构造方法
    private DoubleLockSingleton(){}
    //对外提供一个获取该单例的方法
    public static DoubleLockSingleton getInstance(){
        if(singleton==null){
            synchronized(DoubleLockSingleton.class){
                if(singleton==null){
                    singleton=new DoubleLockSingleton();
                }
            }
        }
        return  singleton;
    }

}

package cn.ck.singleton;

/**
 * 静态内部类单例模式
 * 特点：线程安全，延迟加载，调用效率高，推荐使用
 */
public class InnerClassInstance {
    //私有的构造
    private InnerClassInstance(){}

    //在静态内部类内创建外部类实例。
    private static class InnerSingleton{
        private static final  InnerClassInstance SINGLETON=new InnerClassInstance();
    }

    //对外提供一个静态方法，获取该类的实例
    public static final InnerClassInstance getInstance(){
        return InnerSingleton.SINGLETON;
    }

}

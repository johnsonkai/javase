package cn.ck.test.singleton;

public class TestEagerUnSafe {
    public static void main(String[] args) {
        SingletonThreadOne one= new SingletonThreadOne();
        SingletonThreadTwo two= new SingletonThreadTwo();
        one.start();
        two.start();
        System.out.println("end");
    }
}

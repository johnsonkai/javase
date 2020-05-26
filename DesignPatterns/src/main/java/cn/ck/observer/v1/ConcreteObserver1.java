package cn.ck.observer.v1;

/**
 * 具体观察者类
 */
public class ConcreteObserver1 implements Observer {
    @Override
    public void update() {
        System.out.println("observe1 更新了");
    }
}

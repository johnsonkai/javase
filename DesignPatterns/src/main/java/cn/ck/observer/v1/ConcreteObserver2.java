package cn.ck.observer.v1;

/**
 * 具体观察者
 */
public class ConcreteObserver2 implements Observer {
    @Override
    public void update() {
        System.out.println("observer2 发生变更");
    }
}

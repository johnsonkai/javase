package cn.ck.observer.v1;

/**
 * ����۲�����
 */
public class ConcreteObserver1 implements Observer {
    @Override
    public void update() {
        System.out.println("observe1 ������");
    }
}

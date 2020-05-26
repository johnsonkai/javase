package cn.ck.observer.v1;

public class ObserverClient {
    public static void main(String[] args) {

        Subject subject=new ConcreteSubject();
        Observer observer1=new ConcreteObserver1();
        Observer observer2=new ConcreteObserver2();
        subject.addObserver(observer1);
        subject.addObserver(observer2);
        //�������ⷢ���仯֪ͨ�۲��ߡ�
        subject.notifyObserver();

    }
}

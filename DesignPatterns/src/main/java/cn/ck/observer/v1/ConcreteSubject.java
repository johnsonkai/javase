package cn.ck.observer.v1;

/**
 * ���������ɫ�ࣨ���۲���ࣩ
 */
public class ConcreteSubject extends Subject{
    @Override
    public void notifyObserver() {
        System.out.println("���۲��߷��ֱ仯��...");
        for(Observer observer:super.observerList){
            observer.update();
        }

    }
}

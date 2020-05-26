package cn.ck.observer.v1;

/**
 * 具体主题角色类（被观察的类）
 */
public class ConcreteSubject extends Subject{
    @Override
    public void notifyObserver() {
        System.out.println("被观察者发现变化了...");
        for(Observer observer:super.observerList){
            observer.update();
        }

    }
}

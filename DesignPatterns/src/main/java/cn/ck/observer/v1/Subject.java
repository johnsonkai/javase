package cn.ck.observer.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象主题（被观察角色）
 */
public abstract class Subject{
    //观察者list集合（聚集对象）
    protected List<Observer> observerList=new ArrayList<Observer>();
    //注册观察者
    public void addObserver(Observer observer){
        observerList.add(observer);
    }
    //删除观察者
    public void removeObserver(Observer observer){
        if(observerList.contains(observer)){
            observerList.remove(observer);

        }
    }
    //通知观察者
    public abstract void notifyObserver();
}

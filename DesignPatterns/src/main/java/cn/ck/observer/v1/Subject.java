package cn.ck.observer.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * �������⣨���۲��ɫ��
 */
public abstract class Subject{
    //�۲���list���ϣ��ۼ�����
    protected List<Observer> observerList=new ArrayList<Observer>();
    //ע��۲���
    public void addObserver(Observer observer){
        observerList.add(observer);
    }
    //ɾ���۲���
    public void removeObserver(Observer observer){
        if(observerList.contains(observer)){
            observerList.remove(observer);

        }
    }
    //֪ͨ�۲���
    public abstract void notifyObserver();
}

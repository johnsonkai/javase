package cn.ck.observer.v21;



import java.util.Observable;

/**
 * ���������������һ���RMBRate
 */
public class RMBRate extends Observable{

    public void change (int rateChange) {
        //changed���true
        super.setChanged();
        super.notifyObservers(rateChange);
    }
}

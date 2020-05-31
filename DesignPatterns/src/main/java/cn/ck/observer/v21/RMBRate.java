package cn.ck.observer.v21;



import java.util.Observable;

/**
 * 具体主题对象人民币汇率RMBRate
 */
public class RMBRate extends Observable{

    public void change (int rateChange) {
        //changed变成true
        super.setChanged();
        super.notifyObservers(rateChange);
    }
}

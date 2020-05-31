package cn.ck.observer.v21;

import cn.ck.observer.v2.Company;

import java.util.Observable;
import java.util.Observer;

/**
 * 具体观察者进口公司importCompany
 */
public class ImportCompany implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        int changeRate= (int) arg;
        if(changeRate>=0){
            System.out.println("人民币汇率升值"+changeRate+"个基点，降低了进口产品成本，提升了进口公司利润率");

        } else {
            System.out.println("人民币汇率贬值"+(0-changeRate)+"个基点，提升了进口产品成本，降低了进口公司利润率。");

        }

    }
}

package cn.ck.observer.v21;

import cn.ck.observer.v2.Company;

import java.util.Observable;
import java.util.Observer;

/**
 * ����۲��߽��ڹ�˾importCompany
 */
public class ImportCompany implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        int changeRate= (int) arg;
        if(changeRate>=0){
            System.out.println("����һ�����ֵ"+changeRate+"�����㣬�����˽��ڲ�Ʒ�ɱ��������˽��ڹ�˾������");

        } else {
            System.out.println("����һ��ʱ�ֵ"+(0-changeRate)+"�����㣬�����˽��ڲ�Ʒ�ɱ��������˽��ڹ�˾�����ʡ�");

        }

    }
}

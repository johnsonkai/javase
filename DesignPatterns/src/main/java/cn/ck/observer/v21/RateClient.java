package cn.ck.observer.v21;


import java.util.Observable;
import java.util.Observer;

/**
 * ���ʱ仯�۲���ģʽʵ�ֿͻ�����
 */
public class RateClient {
    public static void main(String[] args) {
        //����۲������ڹ�˾
        Observer importCompany=new ImportCompany();
        //����۲��߶�����ڹ�˾
        Observer exportCompany=new ExportCompany();
        //���������ɫ����Ҷ���
        RMBRate rmbRate=new RMBRate();
        //����۲��߶���
        rmbRate.addObserver(importCompany);
        rmbRate.addObserver(exportCompany);
        //��������
        rmbRate.change(2);
        //���ʽ���
        rmbRate.change(-3);

    }
}

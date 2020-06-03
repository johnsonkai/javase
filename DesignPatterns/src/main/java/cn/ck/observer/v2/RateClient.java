package cn.ck.observer.v2;

import java.util.EventObject;

/**
 * ���ʱ仯�۲���ģʽʵ�ֿͻ�����
 */
public class RateClient {
    public static void main(String[] args) {
        //����۲������ڹ�˾
        Company importCompany=new ImportCompany();
        //����۲��߶�����ڹ�˾
        Company exportCompany=new ExportCompany();
        //���������ɫ����Ҷ���
        Rate rmbRate=new RMBRate();
        //����۲��߶���
        rmbRate.addObserver(importCompany);
        rmbRate.addObserver(exportCompany);
        //��������
        rmbRate.change(2);
        //���ʽ���
        rmbRate.change(-3);

    }
}

package cn.ck.observer.v2;

/**
 * ����۲��߽��ڹ�˾ExportCompany
 */
public class ExportCompany implements Company {
    @Override
    public void update(int changeRate) {
        if(changeRate>=0){
            System.out.println("����һ�����ֵ"+changeRate+"�����㣬�����˽��ڲ�Ʒ�ɱ��������˽��ڹ�˾������");

        } else {
            System.out.println("����һ��ʱ�ֵ"+(0-changeRate)+"�����㣬�����˽��ڲ�Ʒ�ɱ��������˽��ڹ�˾�����ʡ�");

        }
    }
}

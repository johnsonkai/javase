package cn.ck.factory.factorymethod;

/**
 * ���������ͻ��˲�����
 */
public class ClientTest {
    public static void main(String[] args) {
        //�������۹���
        AbstractFactory benZFactory=new BenZFactory();
        //����������
        AbstractFactory bWMFactory=new BenZFactory();
        //����һ������
        Car benZ= benZFactory.createCar();
        //����һ������
        Car bWM=bWMFactory.createCar();
        benZ.run();
        bWM.run();


    }
}

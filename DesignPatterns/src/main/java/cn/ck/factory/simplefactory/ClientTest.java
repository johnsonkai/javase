package cn.ck.factory.simplefactory;

/**
 * �򵥹����ͻ��˲�����
 */
public class ClientTest {
    public static void main(String[] args) {
        //����һ��������������
        CarFactory carFactory=new CarFactory();
        //����һ������
        Car benZ= carFactory.createBenZ();
        //����һ������
        Car bWM=carFactory.createBWM();
        benZ.run();
        bWM.run();
        //���Ծ�̬����
        //����һ������
        Car benZ1= carFactory.createBenZ();
        //����һ������
        Car bWM1=carFactory.createBWM();
        benZ1.run();
        bWM1.run();

    }
}

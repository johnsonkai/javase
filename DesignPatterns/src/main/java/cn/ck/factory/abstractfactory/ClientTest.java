package cn.ck.factory.abstractfactory;

/**
 * ���󹤳��ͻ��˲�����
 */
public class ClientTest {
    public static void main(String[] args) {
        //�������۹���
        AbstractFactory benZFactory=new BenZFactory();
        //����������
        AbstractFactory bWMFactory=new BenZFactory();
        //����һ������
        Car benZ= benZFactory.createCar();
        //���ɱ�������
        Wheel benZWheel=benZFactory.createWheel();
        //����һ������
        Car bWM=bWMFactory.createCar();
        //���ɱ�������
        Wheel bWMWheel=bWMFactory.createWheel();
        benZ.run();
        benZWheel.functions();
        bWM.run();
        bWMWheel.functions();


    }
}

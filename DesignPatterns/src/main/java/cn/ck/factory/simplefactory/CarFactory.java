package cn.ck.factory.simplefactory;

/**
 * �򵥹�����ʵ���������ó�Ա������������
 * �򵥹���ʵ���˶���Ĵ�������÷��룬��������һ�������͵Ĳ�Ʒ������Ҫ����һ����������������һ���������߼�������ѭ����ԭ��
 */
public class CarFactory {
    //�������۵ķ���
    public Car createBenZ(){
        return new BenZ();
    }
    //��������ķ���
    public Car createBWM(){
        return new BWM();
    }
}

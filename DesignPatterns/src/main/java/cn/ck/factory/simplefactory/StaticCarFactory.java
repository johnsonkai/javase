package cn.ck.factory.simplefactory;

/**
 * �򵥹����ľ�̬�������þ�̬��Ա������������
 * �򵥹���ʵ���˶���Ĵ�������÷��룬��������һ�������͵Ĳ�Ʒ������Ҫ����һ����������������һ���������߼�������ѭ����ԭ��
 */
public class StaticCarFactory {
    //�������۵ľ�̬����
    public BenZ createBenZ(){
        return new BenZ();
    }
    //��������ľ�̬����
    public BWM createBWM(){
        return new BWM();
    }
}

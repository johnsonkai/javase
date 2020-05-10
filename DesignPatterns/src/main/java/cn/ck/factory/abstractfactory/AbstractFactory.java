package cn.ck.factory.abstractfactory;

/**
 *���󹤳�ģʽ������һ�����󹤳������������ɲ�Ʒ�壨һϵ����ز�Ʒ���ķ�����
 * �������������ڲ�Ʒ������ӣ�����һϵ�еĲ�Ʒ��Ҳ������һ�������̳иó��󹤳��������ù����ж�����ɷ�����
 * ���󹤳�Ҫȷ���ò�Ʒ�壬��Ҫ�޸Ĳ�Ʒ��Ĳ�Ʒ���޸Ĳ�Ʒ��Ĳ�Ʒ�����󹤳������幤����Ҫ�޸���Ӧ�Ĳ�Ʒ��
 *
 */
public abstract class  AbstractFactory {
    //����car�ĳ��󷽷�
    public abstract Car createCar();
    //����wheel�ĳ��󷽷�
    public abstract  Wheel createWheel();
}

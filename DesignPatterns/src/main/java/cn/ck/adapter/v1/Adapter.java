package cn.ck.adapter.v1;

/**
 * �������࣬ʵ�ֿͻ�����Ҫ��Ŀ��ӿڣ��̳������߽ӿڣ�������ṹ��������ģʽ
 * ��ת���������ã��������߽ӿ�ת���ɿͻ�����Ҫ��Ŀ��ӿ�
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void method() {
        super.specificMethod();
    }
}

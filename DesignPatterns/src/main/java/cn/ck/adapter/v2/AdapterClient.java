package cn.ck.adapter.v2;



/**
 * �������ͽṹ��������ģʽ�ͻ���
 */
public class AdapterClient {
    public static void main(String[] args) {
        Adaptee adaptee=new Adaptee();
        Target target=new Adapter(adaptee);
        target.method();
    }
}

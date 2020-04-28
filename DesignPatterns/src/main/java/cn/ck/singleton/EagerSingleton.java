package cn.ck.singleton;

/**
 * ����ʽ����ģʽ������ص�ʱ��ʹ���ʵ��
 * �ŵ㣺�̰߳�ȫ�������ʱ�ʹ���ʵ��������Ч�ʸ�
 * ȱ�㣺�����ӳټ��أ�Ӱ��ϵͳ����
 */
public class EagerSingleton {
/*    //jvm������ʱ���ʹ���ʵ��
    private static EagerSingleton singleton = new EagerSingleton();
    */

    private static EagerSingleton singleton=null;
    //�ھ�̬������У�����ʵ��,��̬������ͬʱ��jvm���ص�
    static {
        singleton = new EagerSingleton();
        //˽�й��췽��
    }
    private EagerSingleton(){}

    //�ṩһ����̬�������ⲿ���ã���ȡ�õ���ʵ��
    public static EagerSingleton getInstance(){
        return singleton;
    }

}

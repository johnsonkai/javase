package cn.ck.singleton;

/**
 * ����ʽ����ģʽ��ʹ��ʱ�Ŵ���ʵ��
 * ���̰߳�ȫ����ģʽ���̲߳���ȫ����ģʽ
 * �̰߳�ȫ����ʽ��
 * �ŵ㣺�ӳټ��أ��̰߳�ȫ��
 * ȱ�㣺ִ��Ч�ʵ͡�
 * �̲߳���ȫ����ʽ��
 * �ŵ㣺�ӳټ��أ�
 * ȱ�㣺�̰߳�ȫ
 */
public class LazySingleton {

    private static LazySingleton singleton;
    //˽�й��췽��
    private LazySingleton(){}
    //1.�̲߳���ȫ�ĵ�����ʽ�������ṩһ����ͬ���ķ��������ⲿʹ���ߵ��ã����Ƽ�ʹ��
    /*public static LazySingleton getInstance(){
        if(singleton==null){
            singleton=new LazySingleton();
        }
        return singleton;
    }*/
    //2.�̲߳���ȫ�ĵ�����ʽ����ͬ���飬ֻ�ǵ�����������Ȼ���ܴ������ʵ��
   /* public static LazySingleton getInstance(){
        if(singleton==null){
            synchronized (LazySingleton.class){
                singleton=new LazySingleton();
            }

        }
        return singleton;
    }*/
    // �̰߳�ȫ������ʽ��Ϊ�˽���̰߳�ȫ���ṩһ��ͬ����̬���������ⲿʹ���ߵ��ã����ǵ���Ч�ʵ���
    public static synchronized LazySingleton getInstance(){
        if(singleton==null){
            singleton=new LazySingleton();
        }
        return singleton;
    }



}
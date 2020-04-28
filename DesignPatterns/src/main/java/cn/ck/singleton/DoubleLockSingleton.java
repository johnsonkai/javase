package cn.ck.singleton;

/**
    * ˫�ؼ���������ģʽ��ʵ��������volatile������������֤��ͬ�̶߳�ʵ�������ǿɼ���,����ͬ������鱣֤������ʵ���ǵ����������Ƽ�ʹ��
    * �ŵ㣺�̰߳�ȫ�����ӳټ���
    * ȱ�㣺����Ч�ʲ��Ǻܸߣ����ȶ���ʽͬ����������������Ч��Ҫ�ߡ�
    */
public class DoubleLockSingleton {
    //volatile����ʵ��,1:ʹ�ò�ͬ�̶߳Ը�ʵ���ǿɼ��ģ���ֹ����ָ��������
    private static volatile  DoubleLockSingleton singleton;
    //˽�еĹ��췽��
    private DoubleLockSingleton(){}
    //�����ṩһ����ȡ�õ����ķ���
    public static DoubleLockSingleton getInstance(){
        if(singleton==null){
            synchronized(DoubleLockSingleton.class){
                if(singleton==null){
                    singleton=new DoubleLockSingleton();
                }
            }
        }
        return  singleton;
    }

}

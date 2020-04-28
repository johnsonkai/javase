package cn.ck.singleton;

/**
 * ��̬�ڲ��൥��ģʽ
 * �ص㣺�̰߳�ȫ���ӳټ��أ�����Ч�ʸߣ��Ƽ�ʹ��
 */
public class InnerClassInstance {
    //˽�еĹ���
    private InnerClassInstance(){}

    //�ھ�̬�ڲ����ڴ����ⲿ��ʵ����
    private static class InnerSingleton{
        private static final  InnerClassInstance SINGLETON=new InnerClassInstance();
    }

    //�����ṩһ����̬��������ȡ�����ʵ��
    public static final InnerClassInstance getInstance(){
        return InnerSingleton.SINGLETON;
    }

}

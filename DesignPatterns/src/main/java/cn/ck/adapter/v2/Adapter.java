package cn.ck.adapter.v2;




/**
 * �������࣬ʵ�ֿͻ�����Ҫ��Ŀ��ӿڣ����������߶��������,�������ͽṹ������ģʽ��
 * ��ת���������ã��������߽ӿ�ת���ɿͻ�����Ҫ��Ŀ��ӿ�
 */
public class Adapter  implements Target {
   private Adaptee adaptee;
   public Adapter(Adaptee adaptee){
       this.adaptee=adaptee;
   }
    @Override
    public void method() {
        this.adaptee.specificMethod();
    }
}

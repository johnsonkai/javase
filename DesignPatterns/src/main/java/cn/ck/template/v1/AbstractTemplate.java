package cn.ck.template.v1;

/**
 * ����ģ���ɫ
 */
public abstract  class AbstractTemplate {
    // ģ�巽��
    public void templateMethod(){
        abstractMethod01();
        abstractMethod02();
        if(booleanHook()){
            specificMethod();
        }
        hook();
    }
    /*���󷽷�1*/
    protected abstract void abstractMethod01();
    /*���󷽷�2*/
    protected abstract void abstractMethod02();
    /*���巽��*/
    protected void specificMethod() {
        System.out.println("û����д��specificMethod����");
    }
    /*��ʵ�ֵĹ��Ӻ���*/
    protected  void hook(){};
    /*�ж��õĹ��Ӻ���,Ĭ�Ϸ���false*/
    protected boolean booleanHook(){return false;}
}

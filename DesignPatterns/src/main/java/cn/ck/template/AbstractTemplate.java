package cn.ck.template;

/**
 * ����ģ���ɫ
 */
public abstract  class AbstractTemplate {
    // ģ�巽��
    public void templateMethod(){
        method01();
        method02();
        method03();
    }

    protected abstract void method01();

    protected abstract void method02();

    protected void method03() {
        System.out.println("template method3");
    }
}

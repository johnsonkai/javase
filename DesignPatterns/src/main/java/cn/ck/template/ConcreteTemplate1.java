package cn.ck.template;

/**
 * ����ģ���ɫ,��д�˳������о��巽�����ǳ��󷽷��������󷽷���ģ�巽������д
 */
public class ConcreteTemplate1 extends AbstractTemplate {
    @Override
    protected void method03() {
        System.out.println("concrete template method03");
    }

    @Override
    protected void method01() {
        System.out.println("template method01");
    }

    @Override
    protected void method02() {
        System.out.println("template method2");
    }
}

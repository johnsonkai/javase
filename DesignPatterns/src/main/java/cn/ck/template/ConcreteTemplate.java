package cn.ck.template;

/**
 * ����ģ���ɫ��û����д�������еľ��巽����ģ�巽�������󷽷�����
 */
public class ConcreteTemplate extends AbstractTemplate {
    @Override
    protected void method01() {
        System.out.println("template method01");
    }

    @Override
    protected void method02() {
        System.out.println("template method02");
    }
}

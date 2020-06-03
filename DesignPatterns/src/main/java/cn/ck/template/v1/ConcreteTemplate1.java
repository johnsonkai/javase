package cn.ck.template.v1;

import cn.ck.template.v1.AbstractTemplate;

/**
 * ����ģ���ɫ,�жϹ��ӷ�������ture,���巽������д�����󷽷������ӷ�����д��ģ�巽������д
 */
public class ConcreteTemplate1 extends AbstractTemplate {


    @Override
    protected void hook() {
        System.out.println("��дhook����");
    }

    @Override
    protected boolean booleanHook() {
        return true;
    }

    @Override
    protected void abstractMethod01() {
        System.out.println("��д abstractMethod01����");
    }

    @Override
    protected void abstractMethod02() {
        System.out.println("��д abstractMethod02����");
    }
}

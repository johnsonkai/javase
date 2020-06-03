package cn.ck.template.v1;

import cn.ck.template.v1.AbstractTemplate;

/**
 * ����ģ���ɫ��ģ�巽������Ҫ��д����д���󷽷������巽�������ӷ������ж��õĹ��ӷ�������true��
 */
public class ConcreteTemplate extends AbstractTemplate {
    @Override
    protected void specificMethod() {
        System.out.println("��д specificMethod����");
    }

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

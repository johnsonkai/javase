package cn.ck.template.v2;

/**
 * ��ʦ������˿
 */
public class Cooker extends CookingPotato{
    @Override
    protected boolean vinegarFlag() {
        return true;
    }

    @Override
    protected void salt() {
        System.out.println("������������");
    }

    @Override
    protected void oil() {
        System.out.println("������������");
    }
}

package cn.ck.template.v2;

/**
 * ��ͨ��������˿
 */
public class CommonPeople extends CookingPotato {
    @Override
    protected boolean vinegarFlag() {
        return false;
    }

    @Override
    protected void salt() {
        System.out.println("�ηŶ��ˡ�����");
    }

    @Override
    protected void oil() {
        System.out.println("�ͷŶ��ˡ�����");
    }
}

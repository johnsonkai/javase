package cn.ck.template.v2;

/**
 * ����ģ���࣬������˿��
 */
public abstract class CookingPotato {
    /**������˿��˳��*/
    public void cook(){
        oil();
        potato();
        salt();
        if(vinegarFlag()){
             vinegar();
        }

    }
    /*�Ƿ�Ŵ�*/
    protected boolean vinegarFlag() {
        return false;
    }
    /*�Ŵ�*/
    protected  void vinegar(){
        System.out.println("�����ʵ��Ĵ�");
    };
    /*����*/
    protected abstract void salt();
    /*������˿*/
    private void potato() {
        System.out.println("��������������˿");
    }
    /*����*/
    protected abstract void oil();

}

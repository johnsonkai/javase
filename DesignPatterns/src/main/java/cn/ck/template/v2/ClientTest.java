package cn.ck.template.v2;


/**
 * �ͻ���
 */
public class ClientTest {
    public static void main(String[] args) {
        CookingPotato cooker=new Cooker();
        CookingPotato commonPeople=new CommonPeople();
        //��ʦ��cook����
        cooker.cook();
        //��ͨ�˵�cook����
        commonPeople.cook();
    }
}

package cn.ck.observer.v3;

/**
 * �۲�ģʽ�Ŀͻ��˲�����
 */
public class ObserverClient {
    public static void main(String[] args) {
        //������Ϸ���ںŶ���
       OfficialAccount gameOfficialAccount= new GameOfficialAccount("С����Ϸ���ں�");
       //�����û� jack����
        User jack =new Jack("jack");
        //�����û� mary����
        Mary mary = new Mary("mary");
        //��Ϸ���ں�����û�jack mary
        gameOfficialAccount.addUser(jack);
        gameOfficialAccount.addUser(mary);
        //��Ϸ���ں�׼��Ҫ���͵���Ϣ���������ŷ���
        gameOfficialAccount.setMesessage("lol������Ӣ��tom");
        gameOfficialAccount.setActionCommand("��Ϸ���ں����˵�����Ͱ�ť��������Ϣ");
        //������Ϣ
        gameOfficialAccount.sendMessage();
        //��Ϸ���ں��Ƴ�jack�û�
        gameOfficialAccount.removeUser(jack);
        //�ٴη�����Ϣ
        gameOfficialAccount.sendMessage();

        //�������Ź��ںŶ���
        OfficialAccount newsOfficialAccount= new NewsOfficialAccount("С����Ϸ���ں�");
        //��Ϸ���ں�����û�jack mary
        newsOfficialAccount.addUser(jack);
        newsOfficialAccount.addUser(mary);
        //��Ϸ���ں�׼��Ҫ���͵���Ϣ���������ŷ���
        newsOfficialAccount.setMesessage("��һ��ع�NBA");
        newsOfficialAccount.setActionCommand("���Ź��ں����˵�����Ͱ�ť��������Ϣ");
        //������Ϣ
        newsOfficialAccount.sendMessage();
        //��Ϸ���ں��Ƴ�jack�û�
        newsOfficialAccount.removeUser(jack);
        //�ٴη�����Ϣ
        newsOfficialAccount.sendMessage();






    }

}

package cn.ck.observer.v3;

/**
 * �����û��࣬����۲���
 */
public class Jack extends User {

    public Jack(String userName) {
        super(userName);
    }

    @Override
    public void receiveMessage(MessageEvent messageEvent) {
        OfficialAccount officialAccount=messageEvent.getOfficialAccount();
        System.out.println("�û�"+userName+"��ȡ����Ϣ:"+officialAccount.getMesessage());
    }

}

package cn.ck.observer.v3;

/**
 * �����û��࣬����۲���
 */
public class Mary extends User{
    @Override
    public void receiveMessage(MessageEvent messageEvent) {
        OfficialAccount officialAccount=messageEvent.getOfficialAccount();
        System.out.println("�û�"+userName+"��ȡ����Ϣ:"+officialAccount.getMesessage());
    }
    public Mary(String userName) {
        super(userName);
    }
}

package cn.ck.observer.v3;

/**
 * 具体用户类，具体观察者
 */
public class Mary extends User{
    @Override
    public void receiveMessage(MessageEvent messageEvent) {
        OfficialAccount officialAccount=messageEvent.getOfficialAccount();
        System.out.println("用户"+userName+"获取到消息:"+officialAccount.getMesessage());
    }
    public Mary(String userName) {
        super(userName);
    }
}

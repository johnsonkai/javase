package cn.ck.observer.v1;

/**
 * 具体用户类，具体观察者
 */
public class Jack extends User {

    public Jack(String userName) {
        super(userName);
    }

    @Override
    public void receiveMessage(MessageEvent messageEvent) {
        OfficialAccount officialAccount=messageEvent.getOfficialAccount();
        System.out.println("用户"+userName+"获取到消息:"+officialAccount.getMesessage());
    }

}

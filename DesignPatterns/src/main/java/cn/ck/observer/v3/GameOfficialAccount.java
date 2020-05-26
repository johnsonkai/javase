package cn.ck.observer.v3;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *  �����¼����󣬱��۲���� ����Ϸ���ں�
 */
public class GameOfficialAccount extends OfficialAccount {
    public GameOfficialAccount(String officialName) {
        super(officialName);
    }
    //����һ��list������й۲���user
    private List<User> users=new ArrayList<User>();
    //���һ���۲���user
    public void addUser(User user){
        users.add(user);

    }
    //ɾ��һ���۲���userr
    public void removeUser(User user){
        users.remove(user);
    }
    //֪ͨ�۲���������Ӧ����
    public void notifyUser(MessageEvent event) {
        for (User user : users) {
            user.receiveMessage(event);
        }
    }

    //���ںŷ�����Ϣ�ķ���
    public void sendMessage() {
        System.out.println(actionCommand);
        MessageEvent event=new MessageEvent(new Date(System.currentTimeMillis()),this);
        System.out.println(officialName+"��"+ new SimpleDateFormat("YYYY-MM-dd HH:mm:ss").format(event.getWhen())+"ʱ��������Ϣ��"+mesessage);
        notifyUser(event);

    }
}

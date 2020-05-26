package cn.ck.observer.v3;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *  具体事件对象，被观察对象 ，游戏公众号
 */
public class GameOfficialAccount extends OfficialAccount {
    public GameOfficialAccount(String officialName) {
        super(officialName);
    }
    //创建一个list存放所有观察者user
    private List<User> users=new ArrayList<User>();
    //添加一个观察者user
    public void addUser(User user){
        users.add(user);

    }
    //删除一个观察者userr
    public void removeUser(User user){
        users.remove(user);
    }
    //通知观察者做出相应动作
    public void notifyUser(MessageEvent event) {
        for (User user : users) {
            user.receiveMessage(event);
        }
    }

    //公众号发出消息的方法
    public void sendMessage() {
        System.out.println(actionCommand);
        MessageEvent event=new MessageEvent(new Date(System.currentTimeMillis()),this);
        System.out.println(officialName+"在"+ new SimpleDateFormat("YYYY-MM-dd HH:mm:ss").format(event.getWhen())+"时，发出消息："+mesessage);
        notifyUser(event);

    }
}

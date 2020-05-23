package cn.ck.observer.v1;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 具体事件源对象 被观察对象 新闻类公众号
 */
public class NewsOfficialAccount extends OfficialAccount {

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
        System.out.println(officialName+"在"+ new SimpleDateFormat("YYYY-MM-dd hh:mm:ss").format(event.getWhen())+"时，发出消息："+mesessage);
        notifyUser(event);

    }

    public NewsOfficialAccount(String officialName) {
        super(officialName);
    }





}

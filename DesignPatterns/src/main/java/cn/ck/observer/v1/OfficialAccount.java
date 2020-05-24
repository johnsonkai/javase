package cn.ck.observer.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * 模式微信公众号，抽象的被观察者对象，事件源对象
 */
public abstract  class OfficialAccount {
    protected String officialName;
    protected String mesessage;
    //被观察状态
    protected String actionCommand;
    /*  添加一个观察者uer*/
    public abstract void addUser(User user);
    /*删除一个观察者userr*/
    public abstract void removeUser(User user);
    /*通知观察者user*/
    public abstract  void notifyUser(MessageEvent event);
    /*发送消息的方法*/
    public abstract void sendMessage() ;

    public OfficialAccount(String officialName) {
        this.officialName = officialName;
    }

    public String getOfficialName() {
        return officialName;
    }

    public void setOfficialName(String officialName) {
        this.officialName = officialName;
    }

    public String getMesessage() {
        return mesessage;
    }

    public void setMesessage(String mesessage) {
        this.mesessage = mesessage;
    }

    public String getActionCommand() {
        return actionCommand;
    }

    public void setActionCommand(String actionCommand) {
        this.actionCommand = actionCommand;
    }
}


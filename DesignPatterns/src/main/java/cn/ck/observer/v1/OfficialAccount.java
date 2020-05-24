package cn.ck.observer.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * ģʽ΢�Ź��ںţ�����ı��۲��߶����¼�Դ����
 */
public abstract  class OfficialAccount {
    protected String officialName;
    protected String mesessage;
    //���۲�״̬
    protected String actionCommand;
    /*  ���һ���۲���uer*/
    public abstract void addUser(User user);
    /*ɾ��һ���۲���userr*/
    public abstract void removeUser(User user);
    /*֪ͨ�۲���user*/
    public abstract  void notifyUser(MessageEvent event);
    /*������Ϣ�ķ���*/
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


package cn.ck.observer.v1;

/**
 * 事件类，用来记录公众号发出的消息相关信息
 */

import java.util.Date;
public class MessageEvent {
    private Date when;
    private OfficialAccount officialAccount;
    public MessageEvent(Date when, OfficialAccount officialAccount) {
        this.when = when;
        this.officialAccount = officialAccount;
    }


    public Date getWhen() {
        return when;
    }

    public OfficialAccount getOfficialAccount() {
        return officialAccount;
    }

    public void setwhen(Date when) {
        this.when = when;
    }

    public void setOfficialAccount(OfficialAccount officialAccount) {
        this.officialAccount = officialAccount;
    }
}



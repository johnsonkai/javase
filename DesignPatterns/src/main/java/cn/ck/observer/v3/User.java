package cn.ck.observer.v3;

/**
 * �û��࣬����۲���(�¼�Դ����)��
 */
public abstract class User{
    protected String userName;

    public abstract void receiveMessage(MessageEvent messageEvent);

    public User(String userName) {
        this.userName = userName;


    }

    public String getUserName() {
            return userName;
        }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}

package cn.ck.observer.v1;

/**
 * 用户类，抽象观察者(事件源对象)。
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

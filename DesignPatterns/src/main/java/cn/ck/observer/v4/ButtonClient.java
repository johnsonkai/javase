package cn.ck.observer.v4;

import java.util.Observable;

/**
 * 按钮事件测试类
 */
public class ButtonClient {
    public static void main(String[] args) {
        Button b1=new Button();
        Listener listener=new ButtonClickListener();
        b1.setButtonName("button1");
        Button b2=new Button();
        b2.setButtonName("button2");
        b1.addListener(listener);
        b2.addListener(listener);
        b1.press();
        b2.press();


    }
}

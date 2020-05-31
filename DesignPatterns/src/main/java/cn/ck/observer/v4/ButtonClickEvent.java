package cn.ck.observer.v4;


import java.util.EventObject;

/**
 * 按钮点击事件
 */

public class ButtonClickEvent  {
   private Object source;


    public Object getSource() {
        return source;
    }

    public ButtonClickEvent(Object source){
        this.source=source;
    }

}

package cn.ck.observer.v4;
import java.util.ArrayList;
import java.util.List;

/**
 * 自定义按钮类,事件源对象
 */
public class Button {
    private String buttonName;

    protected List<Listener> listenerlist = new ArrayList<Listener>();
    //注册监听器
    public void addListener(Listener listener){
        listenerlist.add(listener);
    }
    //移除监听器
    public void removeListener(Listener listener){
        listenerlist.remove(listener);
    }
    //点击方法
    public void press(){
        ButtonClickEvent event=new ButtonClickEvent(this);
        for (Listener listener:listenerlist){
            listener.actionPerformed(event);
        }
    }

    public String getButtonName() {
        return buttonName;
    }

    public void setButtonName(String buttonName) {
        this.buttonName = buttonName;
    }
}

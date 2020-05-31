package cn.ck.observer.v4;
import java.util.ArrayList;
import java.util.List;

/**
 * �Զ��尴ť��,�¼�Դ����
 */
public class Button {
    private String buttonName;

    protected List<Listener> listenerlist = new ArrayList<Listener>();
    //ע�������
    public void addListener(Listener listener){
        listenerlist.add(listener);
    }
    //�Ƴ�������
    public void removeListener(Listener listener){
        listenerlist.remove(listener);
    }
    //�������
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

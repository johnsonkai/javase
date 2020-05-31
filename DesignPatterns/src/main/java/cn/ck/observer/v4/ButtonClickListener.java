package cn.ck.observer.v4;

/**
 * 按钮点击监听器 具体观察者
 */
public class ButtonClickListener implements Listener {

    @Override
    public void actionPerformed(ButtonClickEvent event) {
       Button button= (Button) event.getSource();
        System.out.println(button.getButtonName()+"按钮被点击了...");
    }
}

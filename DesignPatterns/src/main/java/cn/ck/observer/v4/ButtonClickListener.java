package cn.ck.observer.v4;

/**
 * ��ť��������� ����۲���
 */
public class ButtonClickListener implements Listener {

    @Override
    public void actionPerformed(ButtonClickEvent event) {
       Button button= (Button) event.getSource();
        System.out.println(button.getButtonName()+"��ť�������...");
    }
}

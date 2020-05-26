package cn.ck.observer.v3;

/**
 * 观察模式的客户端测试类
 */
public class ObserverClient {
    public static void main(String[] args) {
        //创建游戏公众号对象
       OfficialAccount gameOfficialAccount= new GameOfficialAccount("小明游戏公众号");
       //创建用户 jack对象
        User jack =new Jack("jack");
        //创建用户 mary对象
        Mary mary = new Mary("mary");
        //游戏公众号添加用户jack mary
        gameOfficialAccount.addUser(jack);
        gameOfficialAccount.addUser(mary);
        //游戏公众号准备要发送的信息，触发短信发送
        gameOfficialAccount.setMesessage("lol出了新英雄tom");
        gameOfficialAccount.setActionCommand("游戏公众号主人点击发送按钮，发送信息");
        //发送消息
        gameOfficialAccount.sendMessage();
        //游戏公众号移除jack用户
        gameOfficialAccount.removeUser(jack);
        //再次发出消息
        gameOfficialAccount.sendMessage();

        //创建新闻公众号对象
        OfficialAccount newsOfficialAccount= new NewsOfficialAccount("小明游戏公众号");
        //游戏公众号添加用户jack mary
        newsOfficialAccount.addUser(jack);
        newsOfficialAccount.addUser(mary);
        //游戏公众号准备要发送的信息，触发短信发送
        newsOfficialAccount.setMesessage("周一板回归NBA");
        newsOfficialAccount.setActionCommand("新闻公众号主人点击发送按钮，发送信息");
        //发送消息
        newsOfficialAccount.sendMessage();
        //游戏公众号移除jack用户
        newsOfficialAccount.removeUser(jack);
        //再次发出消息
        newsOfficialAccount.sendMessage();






    }

}

package cn.ck.template.v2;


/**
 * 客户端
 */
public class ClientTest {
    public static void main(String[] args) {
        CookingPotato cooker=new Cooker();
        CookingPotato commonPeople=new CommonPeople();
        //厨师的cook方法
        cooker.cook();
        //普通人的cook方法
        commonPeople.cook();
    }
}

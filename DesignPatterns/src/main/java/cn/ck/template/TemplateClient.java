package cn.ck.template;

/**
 * 模式方法客户端类
 * 优点： 1、封装不变部分，扩展可变部分。
 * 2、提取公共代码，便于维护。
 * 3、行为由父类控制，子类实现。
 *
 缺点：每一个不同的实现都需要一个子类来实现，导致类的个数增加，使得系统更加庞大。
 */
public class TemplateClient {
    public static void main(String[] args) {
        //创建具体模板类，抽象类具体方法不重写
        AbstractTemplate template=new ConcreteTemplate();
        //调用模板方法也叫钩子函数
        template.templateMethod();
        //创建具体模板类，抽象类具体方法重写
        AbstractTemplate template1=new ConcreteTemplate1();
        //调用模板方法也叫钩子函数
        template1.templateMethod();
    }
}

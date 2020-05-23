package cn.ck.template;

/**
 * 具体模板角色,重写了抽象父类中具体方法（非抽象方法），抽象方法，模板方法不重写
 */
public class ConcreteTemplate1 extends AbstractTemplate {
    @Override
    protected void method03() {
        System.out.println("concrete template method03");
    }

    @Override
    protected void method01() {
        System.out.println("template method01");
    }

    @Override
    protected void method02() {
        System.out.println("template method2");
    }
}

package cn.ck.template;

/**
 * 具体模板角色，没有重写抽象父类中的具体方法，模板方法，抽象方法抽象
 */
public class ConcreteTemplate extends AbstractTemplate {
    @Override
    protected void method01() {
        System.out.println("template method01");
    }

    @Override
    protected void method02() {
        System.out.println("template method02");
    }
}

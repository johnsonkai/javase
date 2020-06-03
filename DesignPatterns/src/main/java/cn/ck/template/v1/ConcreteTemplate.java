package cn.ck.template.v1;

import cn.ck.template.v1.AbstractTemplate;

/**
 * 具体模板角色，模板方法不需要重写，重写抽象方法，具体方法，钩子方法。判断用的钩子方法返回true；
 */
public class ConcreteTemplate extends AbstractTemplate {
    @Override
    protected void specificMethod() {
        System.out.println("重写 specificMethod方法");
    }

    @Override
    protected void hook() {
        System.out.println("重写hook方法");
    }

    @Override
    protected boolean booleanHook() {
        return true;
    }

    @Override
    protected void abstractMethod01() {
        System.out.println("重写 abstractMethod01方法");
    }

    @Override
    protected void abstractMethod02() {
        System.out.println("重写 abstractMethod02方法");
    }
}

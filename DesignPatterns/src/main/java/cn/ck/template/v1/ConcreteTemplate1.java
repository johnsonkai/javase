package cn.ck.template.v1;

import cn.ck.template.v1.AbstractTemplate;

/**
 * 具体模板角色,判断钩子方法返回ture,具体方法不重写。抽象方法，钩子方法重写，模板方法不重写
 */
public class ConcreteTemplate1 extends AbstractTemplate {


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

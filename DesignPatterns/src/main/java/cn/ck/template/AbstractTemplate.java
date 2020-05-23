package cn.ck.template;

/**
 * 抽象模板角色
 */
public abstract  class AbstractTemplate {
    // 模板方法
    public void templateMethod(){
        method01();
        method02();
        method03();
    }

    protected abstract void method01();

    protected abstract void method02();

    protected void method03() {
        System.out.println("template method3");
    }
}

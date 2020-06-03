package cn.ck.template.v1;

/**
 * 抽象模板角色
 */
public abstract  class AbstractTemplate {
    // 模板方法
    public void templateMethod(){
        abstractMethod01();
        abstractMethod02();
        if(booleanHook()){
            specificMethod();
        }
        hook();
    }
    /*抽象方法1*/
    protected abstract void abstractMethod01();
    /*抽象方法2*/
    protected abstract void abstractMethod02();
    /*具体方法*/
    protected void specificMethod() {
        System.out.println("没有重写的specificMethod方法");
    }
    /*空实现的钩子函数*/
    protected  void hook(){};
    /*判断用的钩子函数,默认返回false*/
    protected boolean booleanHook(){return false;}
}

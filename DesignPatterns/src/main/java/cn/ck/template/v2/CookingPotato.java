package cn.ck.template.v2;

/**
 * 抽象模板类，做土豆丝类
 */
public abstract class CookingPotato {
    /**炒土豆丝的顺序*/
    public void cook(){
        oil();
        potato();
        salt();
        if(vinegarFlag()){
             vinegar();
        }

    }
    /*是否放醋*/
    protected boolean vinegarFlag() {
        return false;
    }
    /*放醋*/
    protected  void vinegar(){
        System.out.println("放入适当的醋");
    };
    /*放盐*/
    protected abstract void salt();
    /*放土地丝*/
    private void potato() {
        System.out.println("放入足量的土豆丝");
    }
    /*放油*/
    protected abstract void oil();

}

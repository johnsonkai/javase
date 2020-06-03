package cn.ck.template.v2;

/**
 * 普通人做土豆丝
 */
public class CommonPeople extends CookingPotato {
    @Override
    protected boolean vinegarFlag() {
        return false;
    }

    @Override
    protected void salt() {
        System.out.println("盐放多了。。。");
    }

    @Override
    protected void oil() {
        System.out.println("油放多了。。。");
    }
}

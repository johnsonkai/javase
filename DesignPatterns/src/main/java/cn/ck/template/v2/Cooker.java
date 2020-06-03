package cn.ck.template.v2;

/**
 * 厨师做土豆丝
 */
public class Cooker extends CookingPotato{
    @Override
    protected boolean vinegarFlag() {
        return true;
    }

    @Override
    protected void salt() {
        System.out.println("放入适量的盐");
    }

    @Override
    protected void oil() {
        System.out.println("放入适量的油");
    }
}

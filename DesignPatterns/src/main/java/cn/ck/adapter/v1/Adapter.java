package cn.ck.adapter.v1;

/**
 * 适配器类，实现客户端需要的目标接口，继承适配者接口，这是类结构的适配器模式
 * 起转换器的作用：将适配者接口转换成客户端需要的目标接口
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void method() {
        super.specificMethod();
    }
}

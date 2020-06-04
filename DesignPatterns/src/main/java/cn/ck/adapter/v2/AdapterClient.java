package cn.ck.adapter.v2;



/**
 * 对象类型结构的适配者模式客户端
 */
public class AdapterClient {
    public static void main(String[] args) {
        Adaptee adaptee=new Adaptee();
        Target target=new Adapter(adaptee);
        target.method();
    }
}

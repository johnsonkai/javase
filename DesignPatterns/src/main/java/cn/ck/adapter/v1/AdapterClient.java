package cn.ck.adapter.v1;

/**
 * 类接口类型的适配者模式客户端
 */
public class AdapterClient {
    public static void main(String[] args) {
        Target target=new Adapter();
        target.method();
    }
}

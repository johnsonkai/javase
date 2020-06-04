package cn.ck.adapter.v2;




/**
 * 适配器类，实现客户端需要的目标接口，持有适配者对象的引用,对象类型结构适配者模式。
 * 起转换器的作用：将适配者接口转换成客户端需要的目标接口
 */
public class Adapter  implements Target {
   private Adaptee adaptee;
   public Adapter(Adaptee adaptee){
       this.adaptee=adaptee;
   }
    @Override
    public void method() {
        this.adaptee.specificMethod();
    }
}

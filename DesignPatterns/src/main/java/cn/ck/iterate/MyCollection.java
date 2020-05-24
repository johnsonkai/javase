package cn.ck.iterate;

/**
 * 定义抽象集合类（集聚类）
 */
public interface MyCollection<E> {
    //提供一个方法产生迭代器
    Iterator<E> iterate ();

}

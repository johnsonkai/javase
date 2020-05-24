package cn.ck.iterate;

/**
 * 迭代器客户端测试类，迭代器模式，主要用来变量自己的写聚集类（集合类）的元素
 */
public class IteratorClient {
    public static void main(String[] args) {
        MyArrayList<String> myArrayList =new MyArrayList<String>();
        {
            myArrayList.add("jack");
            myArrayList.add("mary");
            myArrayList.add("jerk");

        }
        //获取迭代器
        Iterator<String> iterator =myArrayList.iterate();
        //迭代器变量MyArrayList集合
        while(iterator.hasNext()){
            String name=iterator.next();
            System.out.println(name);
        }
        MyLinkedList<String> myLinkedList =new MyLinkedList<String>();
        {
            myLinkedList.add("jack");
            myLinkedList.add(null);
            myLinkedList.add("mary");

        }
        //LinkedList获取迭代器
        Iterator<String> iterator1 =myLinkedList.iterate();
        //迭代器变量MyArrayList集合
        while(iterator1.hasNext()){
            String name=iterator1.next();
            System.out.println(name);
        }

    }
}

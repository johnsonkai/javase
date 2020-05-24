package cn.ck.iterate;

/**
 * �������ͻ��˲����࣬������ģʽ����Ҫ���������Լ���д�ۼ��ࣨ�����ࣩ��Ԫ��
 */
public class IteratorClient {
    public static void main(String[] args) {
        MyArrayList<String> myArrayList =new MyArrayList<String>();
        {
            myArrayList.add("jack");
            myArrayList.add("mary");
            myArrayList.add("jerk");

        }
        //��ȡ������
        Iterator<String> iterator =myArrayList.iterate();
        //����������MyArrayList����
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
        //LinkedList��ȡ������
        Iterator<String> iterator1 =myLinkedList.iterate();
        //����������MyArrayList����
        while(iterator1.hasNext()){
            String name=iterator1.next();
            System.out.println(name);
        }

    }
}

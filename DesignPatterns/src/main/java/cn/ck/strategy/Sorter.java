package cn.ck.strategy;

/**
 * ������
 */
public class Sorter <T>{
    Comparator<T> comparator;

    public Sorter(Comparator<T> comparator) {
        this.comparator = comparator;
    }

    public  void insertSort(T [] ary ) {
        for (int i = 1; i < ary.length; i++) {
            int j=i;//jΪҪ����Ԫ���±�
            T temp=ary[i];//�ݴ�Ҫ�����Ԫ��
            while(j>0&&comparator.compare(ary[j-1],temp)>0) {//��Ҫ����Ԫ���������������Ԫ�ؽ��бȽϣ��ҵ�Ҫ�����λ��
                ary[j]=ary[j-1];
                j--;
            }
            ary[j]=temp;//����Ҫ�����Ԫ��

        }
    }
}

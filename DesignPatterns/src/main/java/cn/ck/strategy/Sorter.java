package cn.ck.strategy;

/**
 * 排序类
 */
public class Sorter <T>{
    Comparator<T> comparator;

    public Sorter(Comparator<T> comparator) {
        this.comparator = comparator;
    }

    public  void insertSort(T [] ary ) {
        for (int i = 1; i < ary.length; i++) {
            int j=i;//j为要插入元素下标
            T temp=ary[i];//暂存要插入的元素
            while(j>0&&comparator.compare(ary[j-1],temp)>0) {//将要插入元素与已排序的数组元素进行比较，找到要插入的位置
                ary[j]=ary[j-1];
                j--;
            }
            ary[j]=temp;//插入要插入的元素

        }
    }
}

package cn.ck.strategy;

import java.util.*;
import java.util.Comparator;

public class StrategyClient {

    public static void main(String[] args) {
        Student [] students=new Student[]{new Student("jack",23,34),new Student("mary",22,20),
                new Student("jerk",25,33)};
        cn.ck.strategy.Comparator ageComparater=new AgeComparator();
        cn.ck.strategy.Comparator idComparater=new IdComparator();
        //∞¥’’age≈≈–Ú
        //Sorter<Student> sorter=new Sorter<Student>(ageComparater);
        //sorter.insertSort(students);
        //∞¥’’id≈≈–Ú
        Sorter<Student> sorter1=new Sorter<Student>(idComparater);
        sorter1.insertSort(students);

        System.out.println(Arrays.toString(students));
    }






}

package cn.ck.strategy;

public class IdComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getStuId()-o2.getStuId();
    }
}

package cn.ck.strategy;

public class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getStuAge()-o2.getStuAge();
    }
}

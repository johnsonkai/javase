package cn.ck.strategy;

public class Student {
    private String stuName;
    private int stuId;
    private int stuAge;

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public Student(String stuName, int stuId, int stuAge) {
        this.stuName = stuName;
        this.stuId = stuId;
        this.stuAge = stuAge;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuName='" + stuName + '\'' +
                ", stuId=" + stuId +
                ", stuAge=" + stuAge +
                '}';
    }
}

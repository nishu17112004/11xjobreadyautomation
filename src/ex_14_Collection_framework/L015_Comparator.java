package ex_14_Collection_framework;

import java.util.Comparator;

public class L015_Comparator {
    public static void main(String[] args) {

    }
}class Student1{
    private int rollNo;
    private String name;
    private int age;

    public Student1(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }//class AgeComparator implements Comparator<Student1>{
       // public int compare(Student o1,)


   // }
}


package ex_12_oops.Inheritance;

public class L001_Single_Inheritance {
    public static void main(String[] args) {


        Father f1 = new Father();
        f1.display();
        Student s1= new Student();
        s1.info();
        s1.display();
    }
} class Father{
    String name;
    void display(){
        System.out.println("father's home");
    }
} class Student extends Father{
    void info(){
        System.out.println("son");
    }
}

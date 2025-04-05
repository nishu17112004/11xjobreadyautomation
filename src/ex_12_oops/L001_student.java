package ex_12_oops;

public class L001_student {
    public static void main(String[] args) {
       Student s1= new Student();
       s1.student_name="Ankit";
       s1.subject1="computer ";
       s1.subject2="mathametic";

       s1.study();
    }
}

class Student{
    String student_name;
    String subject1;

            String subject2;
            void study(){
                System.out.println("declaring the method");
                System.out.println("name:"+student_name);
                System.out.println("subject1:"+subject1);
                System.out.println("subject2:"+subject2);
            }
}

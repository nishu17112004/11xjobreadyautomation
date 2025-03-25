package ex_09_function;

public class L004_WITH_parameter {
    public static void main(String[] args) {
        greet_with_full_details(  21, 50000);
    }
    static void greet_with_full_details(  int age,double salary){
        System.out.println( "your age is ->"+age+"\n your salary is ->"+salary);
    }
}

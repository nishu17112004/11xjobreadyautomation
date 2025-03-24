package ex_09_function;

public class L004_WITH_parameter {
    public static void main(String[] args) {
        greet_with_full_details(  nishu,21, 50000);
    }
    static void greet_with_full_details( String name, int age,double salary){
        System.out.println("your name is->"+name+"\n your age is ->"+age+"\n your salary is ->"+salary);
    }
}

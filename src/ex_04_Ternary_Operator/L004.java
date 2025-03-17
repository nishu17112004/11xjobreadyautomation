package ex_04_Ternary_Operator;

public class L004 {
    public static void main(String[] args) {
        String age1= args[0];
        System.out.println(age1);
        System.out.println("age1 instance of String");
        int age=Integer.parseInt(age1);
        String result=(age<18)?"minor":(age<65)?"adult":"senior";
        System.out.println(result);

    }





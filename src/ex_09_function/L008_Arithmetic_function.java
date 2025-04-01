package ex_09_function;

import java.util.Scanner;

public class L008_Arithmetic_function {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number1");
        int a= scanner.nextInt();
        Scanner scanner1=new Scanner(System.in);
        System.out.println("enter the number2");
        int b= scanner.nextInt();
        int result_sum=sum(a,b);
        System.out.println(result_sum);
        int result_sub=sub(a,b);
        System.out.println(result_sub);
        int result_mul=mul(a,b);
        System.out.println(result_mul);
        int result_div=div(a,b);
        System.out.println(result_div);
//
    }
    static int sum(int a,int b){
        return a+b;
    }
    static int sub(int a,int b){
        return a-b;
    }
    static int mul(int a,int b){
        return a*b;
    }
    static int div(int a,int b){
        return a/b;
    }
}


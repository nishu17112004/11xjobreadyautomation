package INTERVIEW_QUESTION;

import java.util.Scanner;

public class L002 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter first number");
        int num1=scanner.nextInt();
        Scanner scanner2=new Scanner(System.in);
        System.out.println("enter second number");
        int num2=scanner.nextInt();
        String result=(num1>num2)?"first number is max":"second number is max";
        System.out.println(result);


    }
}

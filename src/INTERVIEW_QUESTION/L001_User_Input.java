package INTERVIEW_QUESTION;

import java.util.Scanner;

public class L001_User_Input {
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
        System.out.println("enter your name");
        String name=scanner.next();
        Scanner scanner1=new Scanner(System.in);
        System.out.println("enter your age");
        int age=scanner1.nextInt();
        Scanner scanner2=new Scanner(System.in);
        System.out.println("enter your salary");
        int salary=scanner2.nextInt();

    }
}

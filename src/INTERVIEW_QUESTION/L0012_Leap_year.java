package INTERVIEW_QUESTION;

import java.util.Scanner;

public class L0012_Leap_year {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter the year");
        int year= scanner.nextInt();
        if ((year%400==0)||(year%4==0) &&( year%100 ==0)){
            System.out.println("leap year:"+year);

        }else {
            System.out.println("Not Leap year:"+year);
        }
    }
}

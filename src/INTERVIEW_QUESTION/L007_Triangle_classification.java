package INTERVIEW_QUESTION;

import java.util.Scanner;

public class L007_Triangle_classification {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the lenght of side1:");
        double side1= scanner.nextDouble();
        Scanner scanner2=new Scanner(System.in);
        System.out.println("enter the lenght of side2:");
        double side2= scanner.nextDouble();
        Scanner scanner3=new Scanner(System.in);
        System.out.println("enter the lenght of side3:");
        double side3= scanner.nextDouble();
        if(side1<=0||side2<=0||side3<=0){
            System.out.println("invalid input:lenght must be positive");
        } else if (side1==side2&&side2==side3&&side1==side3) {
            System.out.println("the triangle is equilateral");

        } else if (side1==side2||side2==side3||side1==side3) {
            System.out.println("the triangle is isosceles");

        }else{
            System.out.println("the triangle is scalene");
        }

    }
}

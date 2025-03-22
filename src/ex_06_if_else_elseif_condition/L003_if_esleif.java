package ex_06_if_else_elseif_condition;

import java.util.Scanner;

public class L003_if_esleif {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number1");
        int num1= scanner.nextInt();
        Scanner scanner2=new Scanner(System.in);
        System.out.println("enter the number2");
        int num2= scanner.nextInt();
        if(num1>num2){
            System.out.println("num1");
        } else if (num1<num2) {
            System.out.println("num2");

        }else {
            System.out.println("equal");
        }


    }
}

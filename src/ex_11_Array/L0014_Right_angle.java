package ex_11_Array;

import java.util.Scanner;

public class L0014_Right_angle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int number= scanner.nextInt();
        for (int i=0;i<number;i++){
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
        }
        System.out.println("");

    }
}

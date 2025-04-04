package ex_11_Array;

import java.util.Scanner;

public class L0015_Left_angle {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the number");
        int num= scanner.nextInt();
        for (int i=num;i>=0;i--){
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

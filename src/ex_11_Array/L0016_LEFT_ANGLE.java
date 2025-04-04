package ex_11_Array;

import java.util.Scanner;

public class L0016_LEFT_ANGLE {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter the num");
        int num= s.nextInt();
        for (int i=0;i<num;i++){

            for (int j=0;j>=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

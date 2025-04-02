package ex_11_Array;

import java.util.Scanner;

public class L0011_INput {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the size");
        int size= scanner.nextInt();
        int [] number= new int[size];
        for (int i=0;i<number.length;i++){
            System.out.println("enter the number");
            number[i]= scanner.nextInt();
        }


    }
}

package ex_09_function;

import java.util.Scanner;

public class L005_Factorial_program {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the factorial series");
        int fact= scanner.nextInt();
        int factorial=1;
        if(fact<=0){
            System.out.println("factorial");
        }else
        {
            for(int i=1; i<=fact; i++){
                factorial=factorial*i;
            }
            System.out.println("factorial is:"+factorial);

        }
    }
}

package ex_06_if_else_elseif_condition;

import java.util.Scanner;

public class L004_ELSEIF {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the score");
        int score= scanner.nextInt();
        char grade='F';
        if (score>=90&&score<=100){
            System.out.println("A");
        } else if (score>=80&&score<=89) {
            System.out.println("B");

        } else if (score>=70&&score<=79) {
            System.out.println("C");

        } else if (score>=60&&score<=69) {
            System.out.println("D");

        }else{
            System.out.println("F");
        }
       System.out.println("your grade is:"+grade);
    }
}

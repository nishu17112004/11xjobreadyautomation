package ex_07_switch_conditon;

import java.util.Scanner;

public class L003_BROWSER {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String browser= scanner.next();
        switch(browser){
            case "chrome":
                System.out.println("starting the chrome");
                System.out.println("........");
                System.out.println("tc1");
                break;
            case "firefox":
                System.out.println("starting the firefox");
                System.out.println("*********");
                System.out.println("tc2");
                break;
            case "edge":
                System.out.println("execute the edge code");
                System.out.println("@@@@@@@");
                System.out.println("tc3");
                break;
            default:
                System.out.println("i have no idea which browser is this");
        }
    }
}

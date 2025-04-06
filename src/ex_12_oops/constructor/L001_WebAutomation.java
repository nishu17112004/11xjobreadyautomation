package ex_12_oops.constructor;

public class L001_WebAutomation {
    public static void main(String[] args) {
        WebAutomation w1= new WebAutomation();
    }
}
class WebAutomation{
    WebAutomation(){
        System.out.println("I want to read a file");
        System.out.println("open a page before coding the scripts");
    }
}

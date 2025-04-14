package ex_12_oops.Static_keyword;

public class L005_Jumbo {
    public static void main(String[] args) {
        Automation t1=new Automation();
        System.out.println(Automation.driver);
        Automation t2= new Automation();
        Automation t3=new Automation();
        System.out.println(t1.driver);
        System.out.println(t3.driver);
        System.out.println(t2.driver);
    }
}class Automation{
    static String driver="chrome";
}

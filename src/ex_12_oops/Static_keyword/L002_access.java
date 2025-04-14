package ex_12_oops.Static_keyword;

public class L002_access {
    public static void main(String[] args) {
        P a=new P();
    }
}class P{
    static {
        System.out.println("SIB");
    }
    P(){
        System.out.println("DC");
    }
    {
        System.out.println("IIB");
    }
}

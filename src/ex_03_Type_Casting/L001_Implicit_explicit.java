package ex_03_Type_Casting;

public class L001_Implicit_explicit {
    public static void main(String[] args) {
        int Course=100;
        float GST=18.5f;
        int total1=Course+(int)GST;
        System.out.println(total1);
        float total2=Course+GST;
       // flaot total3=(flaot)Course+GST;
        System.out.println(total2);
       // System.out.println(total3);




    }
}

package ex_12_oops.Inheritance.multilevel;

public class Main_function {
    public static void main(String[] args) {
        Son s1= new Son();
        s1.SO1();
        s1.FA();
        s1.GF();
        Grandfather g1= new Grandfather();
        g1.GF();
        Father f1= new Father();
        f1.GF();
        f1.FA();
       // Grandfather g1= new Son();
       // g1.SO1;
    }
}

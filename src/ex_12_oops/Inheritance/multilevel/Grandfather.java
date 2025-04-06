package ex_12_oops.Inheritance.multilevel;

public class Grandfather {
    void GF(){
        System.out.println("grandfather's house");
    }

}class Father extends Grandfather{
    void FA(){
        System.out.println("father's home");
    }
}class Son extends Father{
    void SO1(){
        System.out.println("son's home");
    }
}

package ex_12_oops.Abstraction;

public class L001_abtraction {

    public static void main(String[] args) {
        Child c1 = new Child();
        c1.loan50k();c1.loan25k();
       // System.out.println(c1.loan25k());

    }
    }abstract class Father{
        abstract void loan50k();
        void loan25k(){
            System.out.println("given 25k");

        }
    }class Child extends Father{
        @Override
        void loan50k() {
            System.out.println("child pay");
        }
    }



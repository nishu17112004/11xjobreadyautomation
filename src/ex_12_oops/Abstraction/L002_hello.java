package ex_12_oops.Abstraction;

public class L002_hello {
    public static void main(String[] args) {
        Wagonr car=new Wagonr();
        car.drive();
    }
}abstract class Engine{
    abstract void startEngine();
    abstract void stopEngine();
    void normal(){
        System.out.println("normal function");
    }
} class Wagonr extends Engine{
    void startEngine(){
        System.out.println("starting the car");
    }void stopEngine(){
        System.out.println("stopping the car");
    }void drive(){
        startEngine();
        stopEngine();
    }
}

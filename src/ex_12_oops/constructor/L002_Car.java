package ex_12_oops.constructor;

public class L002_Car {
    public static void main(String[] args) {
        Car c1=  new Car( "telsa",2020, "tata");
       c1.name="telsa";
       c1.year=2020;
       System.out.println(c1.name);
       c1.year=2020;
        System.out.println(c1.year);
        Car c2= new Car("verna",2025, " mandira" );
        c2.name="verna";
        c2.model="mandira";
        System.out.println(c2.name);
        System.out.println(c2.model);
    }
}
class Car{
    String name;
    int year;
    String model;
    Car(String name,int year,String model){
        this.name="name";
        this.year=year;
        this.model="model";

    }
}

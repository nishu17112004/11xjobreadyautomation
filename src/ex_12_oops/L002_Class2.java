package ex_12_oops;

public class L002_Class2 {
    public static void main(String[] args) {
        Car car = new Car();
        car.name = "Telsa";
        car.year = 2023;
        car.running();
    }
}
    class Car {
        String name;
        String model;
        int year;

        void running() {
            System.out.println("enter the name of car");
            System.out.println("name:" + name);
            System.out.println("model:" + model);
            System.out.println("year:" + year);
        }
    }

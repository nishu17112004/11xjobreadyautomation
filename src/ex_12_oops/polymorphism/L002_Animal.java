package ex_12_oops.polymorphism;

public class L002_Animal {
    public static void main(String[] args) {
        Dog d= new Dog();
        d.sound();
        System.out.println(d);
        Animal a= new Animal();
        a.sound();
        System.out.println(a);
    }
}
class Animal{
    void sound(){
        System.out.println("Animal Sound");
    }
}class Dog extends Animal{
    @Override
    void sound() {
        System.out.println("bark");

    }
}
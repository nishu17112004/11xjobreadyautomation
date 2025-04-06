package ex_12_oops.constructor;

public class L003_Person {
    public static void main(String[] args) {
        Person p1= new Person("Amit","XYZ",9027);
        p1.address="XYZ";
        p1.name="Amit";
        System.out.println(p1.name);
        Person p2= new Person("Kanchan","ABC",6399);
        p2.name="Kanchan";
        p1.eat();
        p2.eat();
    }
}
class Person{
    String name;
    String address;
    int phone;
    Person(String name,String address, int phone){
        this.name="name";
        this.address="address";
        this.phone=phone;
    }void eat(){
        System.out.println(name+"is eating");
    }
}

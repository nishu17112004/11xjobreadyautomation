package ex_12_oops.Abstraction;

public class L003_world {
    public static void main(String[] args) {

    }
}abstract class Employee{
    private String name;
    private String address;
    private int number;
    Employee(){

    }Employee(String name,String address,int number){
        System.out.println("constructing an Employee");
        this.name=name;
        this.address=address;
        this.number=number;
    }
abstract double Computepay();
    void mailCheck(){
        System.out.println("Mailing a check to"+this.name+" "+this.address+" "+this.number);}
}
class C1 extends Employee{
    @Override
    double Computepay() {
        return 0;
    }
}

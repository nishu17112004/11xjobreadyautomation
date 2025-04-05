package ex_12_oops.object;

public class L001_Object1 {
    public static void main(String[] args) {


    Animal a= new Animal();
    a.name="Lion ";
    a.type="wild animal";
   // a.name="Cat";
   // a.type="pet animal";
    a.makeSound(); }
}
class Animal{
    String name;
    String type;
    void makeSound(){
        System.out.println(name +"is a "+ type+ " and it make a sound");
    }
}

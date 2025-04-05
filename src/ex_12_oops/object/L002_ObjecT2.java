package ex_12_oops.object;

public class L002_ObjecT2 {
    public static void main(String[] args) {
        Persion p1= new Persion();
        p1.name="ANKIT";
        p1.password="Nis123";
        p1.displayInfo();
    }
}
class Persion{
    String name;
    String password;
    void displayInfo(){
        System.out.println("enter the name with password");
        System.out.println("name-> "  +name+  "password->"+password);
    }
}

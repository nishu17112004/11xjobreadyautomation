package ex_12_oops.Interface;

public class L002_Area {
    public static void main(String[] args) {
        ConcreateClass c= new ConcreateClass();
        c.display();
       // System.out.println(a);

    }
}
class ConcreateClass implements Incomplete{
    public void display(){
        System.out.println("hii");
    }
}interface Incomplete{
    int a=10;
    void display();
}
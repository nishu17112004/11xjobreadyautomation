package ex_12_oops.Static_keyword;

public class L003_Modifier {
    public static void main(String[] args) {
        B.commomToAll();
        B a=new B();
        a.display();
        B g= new B();
        g.display();
    }

}class B{
    static {
        System.out.println("SIB,called once,class is loaded");
    }
    int a=10;
    static int b=10;
    void display(){
        System.out.println("non static");
    }
    static void commomToAll(){
        System.out.println("static");
    }
}

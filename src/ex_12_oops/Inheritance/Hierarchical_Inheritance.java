package ex_12_oops.Inheritance;

public class Hierarchical_Inheritance {
    public static void main(String[] args) {
      Nepal F= new Nepal();
      F.display();
      Ankit A= new Ankit();
      A.display();
      Rinku R= new Rinku();
      R.display();
      R.bro();
    }
}
class Nepal{
    void display(){
        System.out.println("every father is great father in the world");
    }
}class Ankit extends Father{
    void Info(){
        System.out.println("he is my hushand and best husband in the world");
    }
}class Rinku extends Father{
    void bro(){
        System.out.println("he is my brother");
    }
}

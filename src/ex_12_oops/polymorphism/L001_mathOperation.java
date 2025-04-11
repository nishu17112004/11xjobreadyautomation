package ex_12_oops.polymorphism;

public class L001_mathOperation {
    public static void main(String[] args) {
        Mathoperation m= new Mathoperation();
        int r1= m.add(3,4);
        int r2= m.add(5,6,9);
        double d= m.add(19,55);
        float f= m.add(26,44);
        System.out.println(r1);
        System.out.println(d);
        System.out.println(f);
    }
} class Mathoperation{
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;

    }
    double add(double a,double b){
        return a+b;
    }float add(float a,float b,float c){
        return a+b+c;
    }
}

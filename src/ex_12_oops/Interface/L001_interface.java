package ex_12_oops.Interface;

public class L001_interface {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle();
        r1.getArea(10,20);
    }
}interface Polygon{
    void getArea(int length,int breadth);
}class Rectangle implements Polygon{
    @Override
    public void getArea(int length, int breadth) {
        System.out.println("the area of the rectangle is"  +(length*breadth));
    }
}

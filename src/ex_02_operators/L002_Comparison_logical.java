package ex_02_operators;

public class L002_Comparison_logical {
    public static void main(String[] args) {
        int x= 5;
        int y= 3;
        System.out.println(x>=y);
        System.out.println(x=y);
        System.out.println(x!=y);
        System.out.println(x<8 && y<5);
        System.out.println(x<9 || y<4);
        System.out.println (!(x<8 && y<5));

    }
}

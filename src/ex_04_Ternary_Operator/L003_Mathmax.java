package ex_04_Ternary_Operator;

public class L003_Mathmax {
    public static void main(String[] args) {
        int x=28;
        int y=67;
        System.out.println(Math.max(x,y));
        String max= x<y?"x is max":"y is max";
        System.out.println(max);
    }
}

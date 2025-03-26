package ex_10_String_Function;

public class L005_Equal_IgnoreCase {
    public static void main(String[] args) {
        String s="Chanchal";
        System.out.println(s.equalsIgnoreCase("chanchal"));
        System.out.println(s.indexOf('n'));
        System.out.println(s.replace('n','N'));
    }
}

package ex_10_String_Function;

public class L007_location_check {
    public static void main(String[] args) {
        String s1="GOROCHANA";
        String s4="GOROCHANA";
        String s3=new String("GOROCHANA");
        String s2=new String("GOROCHANA");
        System.out.println(s1==s4);
        System.out.println(s3==s2);
        System.out.println(s1==s3);
        System.out.println(s2==s1);
    }
}

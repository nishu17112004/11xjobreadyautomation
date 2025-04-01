package ex_10_String_Function;

public class L011_Append {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Nishu");
        sb.append("Ankit");
        System.out.println(sb);
        sb.delete(0,9);
        System.out.println(sb);
     //   sb.replace(0,4,Str:"(++)");
        System.out.println(sb);
    }
}

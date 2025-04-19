package ex_14_Collection_framework;
import java.util.Stack;
public class L008_stack {
    public static void main(String[] args) {
        Stack s=new Stack<>();
        s.push("nepal");
        s.push("ajaypali");
        s.push("chanchal");
        s.push("bholebaba");
        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.empty());
        System.out.println(s.add("ANKIT"));
        System.out.println(s.add("GINNI"));
        System.out.println(s);
        s.add("nannu");
        s.add("laddu");
        s.push("amit");
        System.out.println(s);

    }
}

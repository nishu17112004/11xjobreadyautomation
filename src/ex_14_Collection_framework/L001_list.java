package ex_14_Collection_framework;
import java.util.ArrayList;
import java.util.List;

public class L001_list {
    public static void main(String[] args) {

        List list= List.of("mango","apple","orange");
        System.out.println(list);
        List l=new ArrayList();
        l.add("hello");
        l.add(123);
        l.add("nishu");
        l.add("true");
        System.out.println(l);
    }
}

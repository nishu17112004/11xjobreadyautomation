package ex_14_Collection_framework;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class L011_Set {
    public static void main(String[] args) {
        Set hs=new HashSet<>();
        Set lhs=new LinkedHashSet();
        Set ts=new TreeSet();
        hs.add("girvar");
        hs.add("shombeti");
        hs.add("anuj");
        hs.add("ankit");
        hs.add("nishu");
        System.out.println(hs);
        System.out.println(lhs);

    }
}

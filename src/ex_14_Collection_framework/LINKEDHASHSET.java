package ex_14_Collection_framework;

import java.util.LinkedHashSet;
import java.util.Set;
public class LINKEDHASHSET {
    public static void main(String[] args) {
        Set lhs= new LinkedHashSet();
        lhs.add("bholebaba");
        lhs.add("durga maa");
        lhs.add("sarswati maa");
        lhs.add("shanidev");
        System.out.println(lhs.contains("durga"));
        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.size());
    }
}

package ex_14_Collection_framework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class L013_set_Iterator {
    public static void main(String[] args) {
        Set<String> s=new HashSet<>();
        s.add("nepal");
        s.add("ajaypali");
        s.add("ankit");
        s.add("nishu");        s.add("nishu");

        System.out.println(s);
        System.out.println("*********");
        for (String hs:s){
            System.out.println(s);
        }
        System.out.println("*********");
        Iterator iterator= s.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("&&&&&&&&");
        Set ts=new TreeSet();
        ts.add("nannu");
        ts.add("ginni");
        ts.add("laddu");
        ts.add("chiku");
      //  System.out.println(null);
        System.out.println(ts);
        for (Object o:ts){
            System.out.println(ts);
        }
    }
}

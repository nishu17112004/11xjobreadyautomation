package ex_14_Collection_framework;

import java.util.ArrayList;

public class L002_ArrayList {
    public static void main(String[] args) {
        ArrayList a=new ArrayList<>();
        a.add("Nishu");
        a.add("Ankit");
        a.add(456);
        a.add("Ginni");
        System.out.println(a.size());
        System.out.println(a);
        System.out.println(a.isEmpty());
    }
}

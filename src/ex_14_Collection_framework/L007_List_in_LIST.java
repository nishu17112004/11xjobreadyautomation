package ex_14_Collection_framework;

import java.util.ArrayList;
import java.util.List;

public class L007_List_in_LIST {
    public static void main(String[] args) {
        List<String>fruites=new ArrayList<>();
        fruites.add("mango");
        fruites.add("apple");
        fruites.add("cherry");
        System.out.println(fruites);
        System.out.println("******");
        List fruites2=new ArrayList<>();
        fruites2.add("banana");
        fruites2.add("orange");
        fruites2.add("papaya");
        System.out.println(fruites2);
        System.out.println("********");
        List vege=new ArrayList<>();
        vege.add("onion");
        vege.add("tomato");
        vege.add("tomato");
        vege.add("pea");
        System.out.println(vege);
        System.out.println("*********");
        List all_fruite3=new ArrayList<>();
        all_fruite3.add(fruites);
        all_fruite3.add(fruites2);
        all_fruite3.add(vege);
        System.out.println(all_fruite3);
        System.out.println(all_fruite3.get(2));
    }
}

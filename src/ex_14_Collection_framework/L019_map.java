package ex_14_Collection_framework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class L019_map {
    public static void main(String[] args) {
        Map m1=new HashMap<>();
        m1.put("name","Nishu");
        m1.put("phone",987509335);
        m1.put("rollNo",1);
        System.out.println(m1);
        Map m2=new LinkedHashMap();
        m2.put("name","Ankit");
        m2.put("rollNo",1);
        m2.put("phone",957563827);
        System.out.println(m2);
        Map m3=new TreeMap<>();
        m3.put("first name","nishu");
        m3.put("last name","bosatta");
        m3.put("rollNo",1);
        m3.put("phone",987645432);
        System.out.println(m3);
    }
}

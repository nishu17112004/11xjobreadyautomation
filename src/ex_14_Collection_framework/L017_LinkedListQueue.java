package ex_14_Collection_framework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class L017_LinkedListQueue {
    public static void main(String[] args) {
        Queue<Integer>  a=new LinkedList<>();
        a.add(6);
        a.add(8);
        a.add(4);
        Iterator<Integer> iterator=a.iterator();
        while(iterator.hasNext()){
            Integer value= iterator.next();
            System.out.println(value);
        }// while(iterator.hasPreviou){

        }

    }
//}

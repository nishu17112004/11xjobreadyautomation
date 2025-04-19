package ex_14_Collection_framework;

import java.util.ArrayDeque;
import java.util.Deque;

public class L018_ArrayDeque {
    public static void main(String[] args) {
        Deque<Integer>deck=new ArrayDeque<>();
      //  deck.push(15);
       deck.add(12);
        deck.add(10);
       // deck.push(20);
        System.out.println(deck);
    }
}

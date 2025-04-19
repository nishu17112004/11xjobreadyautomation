package ex_14_Collection_framework;

import java.util.PriorityQueue;

public class L016_Queue {
    public static void main(String[] args) {
        PriorityQueue q=new PriorityQueue<>();
        q.add("nishu");
        q.add("ankit");
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
    }
}

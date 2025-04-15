package ex_14_Collection_framework;

import java.util.LinkedList;

public class L004_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> animals=new LinkedList<>();
        animals.add("dog");
        animals.add("cat");
        animals.addFirst("camel");
        animals.addLast("lion");
        System.out.println("LinkedList:"+animals);
        System.out.println("First element:"+animals.getFirst());
        System.out.println("Last element:"+animals.getLast());
        animals.removeFirst();
        animals.removeLast();
        System.out.println("LinkedList after removal:"+animals);
        System.out.println("size of LinkedList:"+animals.size());
    }
}

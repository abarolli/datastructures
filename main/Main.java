package main;

import linear.LinkedList;

public class Main {
    public static void main(String[] args) {
        
        var list = new LinkedList<Integer>();
        
        list.addLast(10);
        list.addLast(20);
        list.addFirst(3445);
        list.addLast(30);

        list.addFirst(212);

        System.out.println(list.indexOf(3445));
        System.out.println(list.contains(3445));

        System.out.println(list.contains(30));
        System.out.println(list.contains(11));
    }

    public static void printDetailsOfArray(LinkedList<Integer> l) {
        // System.out.println(l);
        // System.out.println(l.getHead());
        // System.out.println(l.getTail());
    }

}
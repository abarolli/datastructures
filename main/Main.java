package main;

import linear.Array;

public class Main {
    public static void main(String[] args) {
        var arr = new Array(4);
        arr.insert(2);
        arr.insert(1);
        arr.insert(54);


        arr.removeAt(1);

        int i = arr.indexOf(4);
        System.out.println(i);

        arr.print();
    }
}
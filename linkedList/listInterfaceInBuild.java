package linkedList;

import java.util.*;

public class listInterfaceInBuild {
    public static void main(String args[]) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.addFirst("Grapes");
        list.addLast("Bananana");
        list.add(1, "Guava");

        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
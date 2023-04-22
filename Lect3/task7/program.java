package Lect3.task7;

import java.util.*;


public class program {
    public static void main(String[] args) {
        //Character value = null;
        List<Character> list1 = List.of('S', 'e', 'r', 'g', 'e', 'y');
        System.out.println(list1);
        List<Character> list2 = List.copyOf(list1);
        System.out.println(list2);
    }
}

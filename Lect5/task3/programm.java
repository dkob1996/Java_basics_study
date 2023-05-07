package Lect5.task3;

import java.util.*;

public class programm {
    public static void main(String[] args) {
        TreeMap<Integer, String> tMap = new TreeMap<>();
        tMap.put(1, "One");
        System.out.println(tMap); // {1=One}
        tMap.put(6, "Six");
        System.out.println(tMap); // {1=One, 6=Six}
        tMap.put(4, "Four");
        System.out.println(tMap); // {1=One, 4=Four, 6=Six}
        tMap.put(3, "Three");
        System.out.println(tMap); // {1=One, 3=Three, 4=Four, 6=Six}
        tMap.put(2, "Two");
        System.out.println(tMap); // {1=One, 2=Two, 3=Three, 4=Four, 6=Six}
        tMap.put(2, "Two");
        System.out.println(tMap.descendingKeySet());  //[6, 4, 3, 2, 1]
        tMap.put(2, "Two");
        System.out.println(tMap.descendingMap()); //{6=Six, 4=Four, 3=Three, 2=Two, 1=One}
    }
}

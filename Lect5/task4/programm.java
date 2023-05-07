package Lect5.task4;

import java.util.*;

public class programm {
    public static void main(String[] args) {
        Map<Integer, String> linkMap = new LinkedHashMap<>();
        linkMap.put(11, "One one");
        linkMap.put(1, "Two");
        linkMap.put(2, "One");
        System.out.println(linkMap);  //{11=One one, 1=Two, 2=One}
        
        Map<Integer, String> map = new HashMap<>();
        map.put(11, "One one");
        map.put(1, "Two");
        map.put(2, "One");
        System.out.println(map);  //{1=Two, 2=One, 11=One one}
    }
}

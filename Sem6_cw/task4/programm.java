package Sem6_cw.task4;

import java.util.*;

public class programm {
    public static void main(String[] args) {
        System.out.println(isIsomorph("egg", "add")); // true
        System.out.println(isIsomorph("paper", "title")); // true
        System.out.println(isIsomorph("foo", "bar")); // false
        System.out.println(isIsomorph("red", "cat")); // true
        System.out.println(isIsomorph("abcde", "aaaaa")); // true
        System.out.println(isIsomorph("aaaaa", "aaaaa")); // true
        System.out.println(isIsomorph("aaaaa", "abcde")); // false
    }
    static boolean isIsomorph(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }
        // paper, title
        Map<Character, Character> mapping = new HashMap<>();
        for (int i = 0; i < first.length(); i++) {
            char firstSymbol = first.charAt(i); // p
            char secondSymbol = second.charAt(i); // t
            if (!mapping.containsKey(firstSymbol)) {
                mapping.put(firstSymbol, secondSymbol); // {p -> t, a -> i}
            } else {
                char anotherSecondSymbol = mapping.get(firstSymbol);
                if (anotherSecondSymbol != secondSymbol) {
                    return false;
                }
            }
        }
        return true;
    }
}

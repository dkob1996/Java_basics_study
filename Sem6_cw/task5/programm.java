package Sem6_cw.task5;

import java.util.*;

public class programm {
    public static void main(String[] args) {
        System.out.println(isCorrectParentheses("()"));
        System.out.println(isCorrectParentheses("[](){}"));
        System.out.println(isCorrectParentheses("[)"));
        System.out.println(isCorrectParentheses("([{}()<>])"));
        System.out.println(isCorrectParentheses("([)]"));
        System.out.println(isCorrectParentheses("("));
    }
    /**
     * Определить, является ли последовательность скобочек корректной
     * Скобочки могут быть следующих типов (){}[]<>
     * () -> true
     * [](){} -> true
     * [) -> false
     * ([{}()<>]) -> true
     * ([)] -> false
     * ( -> false
     */
    static boolean isCorrectParentheses(String input) {
        Map<Character, Character> pairs = Map.of(
                '(', ')',
                '[', ']',
                '{', '}',
                '<', '>'
        );
        Deque<Character> stack = new ArrayDeque<>();
        //
        // LIFO Last In First Out
        //
        // ] -> [
        // ) -> (
        // } -> {
        // > -> <

        // ((((
        char[] chars = input.toCharArray();
        for (char symbol : chars) { // symbol = ]
            if (pairs.containsKey(symbol)) { // symbol является открывающей скобочкой
                stack.addFirst(symbol);
            } else { // symbol является закрывающей скобочкой
                if (stack.isEmpty()) { // встретили закрывающую, а открывающей раньше не было
                    return false;
                }
                char lastSymbolOpenPair = stack.pollFirst(); // (
                // нужно проверить, что lastSymbol является открывающей по отношению к symbol
                char lastSymbolClosedPair = pairs.get(lastSymbolOpenPair); // )
                if (lastSymbolClosedPair != symbol) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}

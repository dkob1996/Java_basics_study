package Lect4.task4;

import java.util.ArrayDeque;
import java.util.Deque;

public class programm {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1);
        deque.addLast(2);
        deque.removeLast();
        deque.removeLast();
        deque.offerFirst(1);
        deque.offerLast(2);
        deque.pollFirst();
        deque.pollLast();
        deque.getFirst();
        deque.getLast();
        deque.peekFirst();
        deque.peekLast();
    }
}

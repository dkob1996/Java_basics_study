package Lect4.task2;

import java.util.LinkedList;
import java.util.Queue;

public class programm {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        queue.add(2);
        System.out.println(queue);
        int item = queue.remove();
        System.out.println(queue); 
        System.out.println(item);
    }
}

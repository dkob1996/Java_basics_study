package Lect3.task4;

import java.util.List;
import java.util.ArrayList;

public class program {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(123);

        for (Object o: list){
            System.out.println(o);
        }
    }
}

package SemSummaryWork;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Raffle r = new Raffle();
        Scanner sc = new Scanner(System.in);
        while (true) {
            /* 
            System.out.print("""
                    Main menu:
                    1 - Add a new toy into the prize fund
                    2 - Change the frequency of dropping out some toy
                    3 - Hold a raffle and save results
                    0 - EXIT
                    >\s""");
            */
            System.out.println();
            System.out.println("Main menu:");
            System.out.println("1 - Add a new toy into the prize fund");
            System.out.println("2 - Change the frequency of dropping out some toy");
            System.out.println("3 - Hold a raffle and save results");
            System.out.println("0 - Exit");
            System.out.print(">\s");
            var selection = sc.next();
            switch (selection) {
                case "1" -> r.addToy();
                case "2" -> r.setFrequency();
                case "3" -> r.raffle();
                case "0" -> {
                    System.out.println("Bye");
                    System.exit(0);
                }
                default -> System.out.println("Incorrect selection. Try again.");
            }
        }
    }
}
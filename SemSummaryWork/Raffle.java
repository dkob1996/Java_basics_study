package SemSummaryWork;

import java.io.*;
import java.util.*;

public class Raffle {

    private static ArrayList<Toy> toys = new ArrayList<>();
    private static PriorityQueue<Toy> prizes = new PriorityQueue<>();

    private static int idCounter = 0;

    public void addToy() {
        Scanner scan = new Scanner(System.in);
        String title;
        int frequency;
        while (true) {
            System.out.print("Enter Title: ");
            title = scan.nextLine();
            if (title.isEmpty()) {
                System.out.println("Incorrect input. Try again.");
                break;
            }
            System.out.print("Enter Frequency of dropping out: ");
            String value = scan.nextLine();
            if (isDigit(value)) {
                frequency = Integer.parseInt(value);
                if (frequency <= 0) {
                    System.out.println("Incorrect input. Try again.");
                } else {
                    Toy toy = new Toy(idCounter, title, frequency);
                    if (!toys.contains(toy) || toys.size() == 0) {
                        idCounter++;
                        toys.add(toy);
                        System.out.println("New toy was added");
                    } else {
                        System.out.println("This toy is already in the prize fund.");
                    }
                }
            } else {
                System.out.println("Incorrect input. Try again.");
            }
            break;
        }
    }

    public void setFrequency() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Toy ID: ");
        String value = scan.nextLine();
        if (isDigit(value)) {
            int selectedId = Integer.parseInt(value);
            if (selectedId >= 0 && selectedId < toys.size()) {
                System.out.println("Toy " + toys.get(selectedId).getToyTitle() +
                        " has frequency of victory " + toys.get(selectedId).getToyVictoryFrequency());
                System.out.print("Enter new Frequency of dropping out: ");
                value = scan.nextLine();
                if (isDigit(value)) {
                    int newFrequency = Integer.parseInt(value);
                    toys.get(selectedId).setToyVictoryFrequency(newFrequency);
                    System.out.println("Frequency was changed.");
                } else {
                    System.out.println("Incorrect input. Try again.");
                }
            } else {
                System.out.println("There is not toy with such ID in prize fund.");
            }
        } else {
            System.out.println("Incorrect input. Try again.");
        }
    }

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public Toy getPrize() {
        if (prizes.size() == 0) {
            Random rnd = new Random();
            for (Toy toy : toys) {
                for (int i = 0; i < toy.getToyVictoryFrequency(); i++) {
                    Toy temp = new Toy(toy.getToyId(), toy.getToyTitle(), rnd.nextInt(1, 10));
                    prizes.add(temp);
                }
            }
        }
        return prizes.poll();
    }

    public void raffle() {
        if (toys.size() >= 2) {
            Toy prize = getPrize();
            System.out.println("Prize: " + prize.getToyTitle());
            saveResult(prize.getInfo());
        } else {
            System.out.println("You should add at least two toys into prize fund.");
        }
    }

    private void saveResult(String text) {
        File file = new File("Result.txt");
        try {
            file.createNewFile();
        } catch (Exception ignored) {
            throw new RuntimeException();
        }
        try (FileWriter fw = new FileWriter("Result.txt", true)) {
            fw.write(text + "\n");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
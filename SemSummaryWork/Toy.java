package SemSummaryWork;

import java.util.*;

public class Toy implements Comparable<Toy> {

    private int toyId;
    private String toyTitle;
    private int toyVictoryFrequency;

    public Toy(int toyId, String toyTitle, int toyVictoryFrequency) {
        this.toyId = toyId;
        this.toyTitle = toyTitle;
        this.toyVictoryFrequency = toyVictoryFrequency;
    }

    public int getToyId() {
        return toyId;
    }

    public String getToyTitle() {
        return toyTitle;
    }

    public int getToyVictoryFrequency() {
        return toyVictoryFrequency;
    }

    public void setToyVictoryFrequency(int toyVictoryFrequency) {
        this.toyVictoryFrequency = toyVictoryFrequency;
    }

    public String getInfo() {
        return String.format("ID: %d, Title: %s", toyId, toyTitle);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Toy toy = (Toy) o;
        return toyTitle.equals(toy.toyTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(toyTitle);
    }

    @Override
    public int compareTo(Toy o) {
        return Integer.compare(this.toyVictoryFrequency, o.toyVictoryFrequency);
    }
}
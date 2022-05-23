package core.mate.academy.model;

import java.util.Random;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int number = new Random().nextInt(100);
    private int year = (int)Math.floor(Math.random() * (2022 - 1960 + 1) + 1960);

    public Bulldozer() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}

package core.mate.academy.model;

import java.util.Random;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private static final int MAX_HORSE_POWERS = 500;
    private int horsePowers;
    private Random random = new Random();

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int horsePowers) {
        super(name, color);
        this.horsePowers = horsePowers;
    }

    public int getHorsePowers() {
        return horsePowers;
    }

    public void setHorsePowers(int horsePowers) {
        this.horsePowers = horsePowers;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public int getRandomHorsePowers() {
        return random.nextInt(MAX_HORSE_POWERS);
    }
}

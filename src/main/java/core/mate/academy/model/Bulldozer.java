package core.mate.academy.model;

import core.mate.academy.Color;
import java.util.Random;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private static final Random RANDOM = new Random();

    public Bulldozer() {
        super("Bulldozer" + RANDOM.nextInt(33),
                Color.values()[RANDOM.nextInt(Color.values().length)].toString(),
                String.valueOf(RANDOM.nextInt()));
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}

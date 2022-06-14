package core.mate.academy.model;

import core.mate.academy.Color;
import java.util.Random;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private static final Random RANDOM = new Random();

    public Truck() {
        super("Truck" + RANDOM.nextInt(33),
                Color.values()[RANDOM.nextInt(Color.values().length)].toString(),
                String.valueOf(RANDOM.nextInt()));
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}

package core.mate.academy.util;

import java.util.Random;

public class RandomValue {
    private static final int BOUND = 1000;
    private final Random random;

    public RandomValue() {
        random = new Random();
    }

    public int getRandomValue() {
        return random.nextInt(BOUND);
    }
}

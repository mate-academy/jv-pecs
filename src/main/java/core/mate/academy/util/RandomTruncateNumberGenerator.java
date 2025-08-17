package core.mate.academy.util;

import java.util.Random;

public class RandomTruncateNumberGenerator {
    public static final int INTEGER_MAX_LIMIT = 100;
    public static final int DOUBLE_TRUNCATE_TO = 10;
    private static final double DOUBLE_MAX_LIMIT = 100D;
    private static final double DOUBLE_MIN_LIMIT = 1D;
    private final Random random;

    public RandomTruncateNumberGenerator() {
        this.random = new Random();
    }

    public double generateRandomDouble() {
        double generatedDouble = DOUBLE_MIN_LIMIT
                + random.nextDouble()
                * (DOUBLE_MAX_LIMIT - DOUBLE_MIN_LIMIT);
        return Math.floor(generatedDouble * DOUBLE_TRUNCATE_TO) / DOUBLE_TRUNCATE_TO;
    }

    public int generateRandomInteger() {
        return random.nextInt(INTEGER_MAX_LIMIT);
    }
}

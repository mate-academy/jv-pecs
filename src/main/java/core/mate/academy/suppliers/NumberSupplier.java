package core.mate.academy.suppliers;

import java.util.Random;

public class NumberSupplier {
    private Random random = new Random();

    public int getRandomIntNumber(int minValue, int maxValue) {
        return random.nextInt(maxValue - minValue + 1) + minValue;
    }
}

package core.mate.academy.suppliers;

import core.mate.academy.enums.Color;
import java.util.Random;

public class ColorSupplier {
    private static final Color[] COLORS = Color.values();
    private Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(COLORS.length);
        return COLORS[index].name().toLowerCase();
    }
}

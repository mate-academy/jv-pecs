package core.mate.academy.model;

import java.util.Random;

public class ColorSupplier {
    public Color getColor() {
        int index = new Random().nextInt(Color.values().length);
        return Color.values()[index];
    }
}

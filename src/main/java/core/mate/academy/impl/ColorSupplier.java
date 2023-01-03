package core.mate.academy.impl;

import core.mate.academy.enums.Colors;
import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int index = new Random().nextInt(Colors.values().length);
        return Colors.values()[index].toString();
    }
}

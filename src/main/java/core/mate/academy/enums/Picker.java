package core.mate.academy.enums;

import java.util.Random;

public interface Picker {
    Random RANDOM = new Random();

    static <E extends Picker> String random(E[] values) {
        return values[RANDOM.nextInt(values.length)].name();
    }

    String name();
}

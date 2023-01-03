package core.mate.academy.impl;

import core.mate.academy.enums.Models;
import java.util.Random;

public class ModelSupplier {
    public String getRandomModel() {
        int index = new Random().nextInt(Models.values().length);
        return Models.values()[index].toString();
    }
}

package core.mate.academy.model;

import java.util.Random;

public class ModelSupplier {
    public String getRandomModel() {
        int index = new Random().nextInt(Models.values().length);
        return Models.values()[index].toString();
    }
}

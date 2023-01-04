package core.mate.academy.model;

import java.util.Random;

public class ModelSupplier {
    Random random = new Random();

    public String getRandomModel() {
        int index = random.nextInt(Model.values().length);
        return Model.values()[index].name();
    }
}

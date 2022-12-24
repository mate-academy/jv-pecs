package core.mate.academy.model;

import java.util.Random;

public class ModelSupplier {
    public Model getModel() {
        int index = new Random().nextInt(Model.values().length);
        return Model.values()[index];
    }
}

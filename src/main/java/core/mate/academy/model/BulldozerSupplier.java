package core.mate.academy.model;

import java.util.Random;

public class BulldozerSupplier {
    ModelSupplier model = new ModelSupplier();
    ColorSupplier color = new ColorSupplier();

    public Bulldozer getBulldozer() {
        int bucketVolume = new Random().nextInt(10);
        return new Bulldozer(model.getModel().toString(), color.getColor().toString(), bucketVolume);
    }
}

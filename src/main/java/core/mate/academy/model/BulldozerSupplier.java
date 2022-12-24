package core.mate.academy.model;

import java.util.Random;

public class BulldozerSupplier {
    private ModelSupplier model = new ModelSupplier();
    private ColorSupplier color = new ColorSupplier();

    public Bulldozer getBulldozer() {
        int bucketVolume = new Random().nextInt(10);
        return new Bulldozer(model.getModel().toString(),
                color.getColor().toString(), bucketVolume);
    }
}

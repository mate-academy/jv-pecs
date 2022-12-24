package core.mate.academy.model;

import java.util.Random;

public class TruckSupplier {
    private ModelSupplier model = new ModelSupplier();
    private ColorSupplier color = new ColorSupplier();

    public Truck getTruck() {
        int towingCapacity = new Random().nextInt(5) * 10;
        return new Truck(model.getModel().toString(), color.getColor().toString(), towingCapacity);
    }
}

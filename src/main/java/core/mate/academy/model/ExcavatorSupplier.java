package core.mate.academy.model;

import java.util.Random;

public class ExcavatorSupplier {
    private ModelSupplier model = new ModelSupplier();
    private ColorSupplier color = new ColorSupplier();

    public Excavator getExcavator() {
        int randomHeight = new Random().nextInt(6);
        return new Excavator(model.getModel().toString(),
                color.getColor().toString(), randomHeight);
    }
}

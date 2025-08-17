package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        return List.of(new Excavator("CAT", "Yellow", 5.2, "PinkHill"),
                new Excavator("Bubler", "Pink", 4.7, "West Hip"),
                new Excavator("Henk", "White", 4.9, "Google"));
    }
}

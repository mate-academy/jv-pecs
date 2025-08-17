package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = List.of(
                new Excavator("Excavator1", "White", "Iveco"),
                new Excavator("Excavator2", "Red", "Tesla"),
                new Excavator("Excavator3", "Black", "Noname")
        );
        return excavators;
    }
}

package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    public List<Excavator> get() {
        Excavator exca1 = new Excavator("maker1", 1);
        Excavator exca2 = new Excavator("maker1", 2);
        Excavator exca3 = new Excavator("maker1", 3);
        return List.of(exca1, exca2, exca3);
    }
}

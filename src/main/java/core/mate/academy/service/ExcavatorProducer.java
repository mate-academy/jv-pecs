package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        return List.of(
                new Excavator("Excavator_1", "Red", 2019),
                new Excavator("Excavator_2", "Grey", 2020),
                new Excavator("Excavator_3", "Blue", 2021)
        );
    }
}

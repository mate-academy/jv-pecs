package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {

        return List.of(new Excavator("Excavator1", "yellow", 2024),
                new Excavator("Excavator2", "orange", 2023),
                new Excavator("Excavator3", "red", 2022));
    }
}

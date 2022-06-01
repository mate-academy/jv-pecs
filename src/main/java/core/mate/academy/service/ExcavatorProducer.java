package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        return List.of(
                new Excavator("Excavator 1", "red"),
                new Excavator("Excavator 2", "green"),
                new Excavator("Excavator 3", "blue")
        );
    }
}

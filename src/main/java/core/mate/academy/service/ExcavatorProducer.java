package core.mate.academy.service;

import core.mate.academy.model.Excavator;

import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        return List.of(
                new Excavator("first excavator", "red", 13.5),
                new Excavator("second excavator", "blue", 11),
                new Excavator("third excavator", "black", 15)
        );
    }
}

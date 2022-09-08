package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        return List.of(
                new Excavator("First", "red", 20),
                new Excavator("Second", "blue", 30),
                new Excavator("Third", "yellow", 40)
        );
    }
}

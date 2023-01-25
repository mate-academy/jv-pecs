package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        return List.of(new Excavator("First", "yellow", 400.0, "First Brand", 40),
                new Excavator("Second", "green", 350.0, "Second Brand", 35),
                new Excavator("Third", "brown", 430.0, "Third Brand", 45));
    }
}

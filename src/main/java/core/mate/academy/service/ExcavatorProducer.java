package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        return new ArrayList<>(List.of(
                new Excavator("Cat", "yellow", 1999),
                new Excavator("Cat", "Blue", 2000),
                new Excavator("Volvo", "Green", 2001)
        ));
    }
}

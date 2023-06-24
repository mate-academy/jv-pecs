package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        return new ArrayList<>(List.of(
                new Excavator(0.01),
                new Excavator(0.035),
                new Excavator(0.042)
        ));
    }
}

package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private List<Excavator> excavators;

    public ExcavatorProducer() {
        excavators = new ArrayList<>();
    }

    @Override
    public List<Excavator> get() {
        excavators.add(Excavator.of(800,2));
        excavators.add(Excavator.of(1200,4));
        return excavators;
    }
}

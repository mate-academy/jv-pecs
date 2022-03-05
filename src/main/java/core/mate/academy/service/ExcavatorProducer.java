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
        excavators.add(Excavator.of(3, 300));
        excavators.add(Excavator.of(6, 750));
        return excavators;
    }
}

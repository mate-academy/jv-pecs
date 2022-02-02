package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private List<Excavator> excavators;

    public ExcavatorProducer() {
        excavators = new ArrayList<>();
        excavators.add(new Excavator());
        excavators.add(new Excavator(3.5));
        excavators.add(new Excavator(5));
    }

    @Override
    public List<Excavator> get() {
        return excavators;
    }
}

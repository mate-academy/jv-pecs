package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private List<Excavator> excavators = List.of(new Excavator(), new Excavator());

    @Override
    public List<Excavator> get() {
        return excavators;
    }
}

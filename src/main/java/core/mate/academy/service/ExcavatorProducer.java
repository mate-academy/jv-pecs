package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private final List<Excavator> excavatorsList;

    public ExcavatorProducer(List<Excavator> excavatorsList) {
        this.excavatorsList = excavatorsList;
    }

    @Override
    public List<Excavator> get() {
        return excavatorsList;
    }
}

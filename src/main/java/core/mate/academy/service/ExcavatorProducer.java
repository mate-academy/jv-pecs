package core.mate.academy.service;

import core.mate.academy.model.Excavator;

import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private final List<Excavator> excavatorList;

    public ExcavatorProducer(List<Excavator> excavatorList) {
        this.excavatorList = excavatorList;
    }

    @Override
    public List<Excavator> get() {
        return excavatorList;
    }
}

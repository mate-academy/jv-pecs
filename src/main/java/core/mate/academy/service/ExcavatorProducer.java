package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private final List<Excavator> excavators = new ArrayList<>();

    public ExcavatorProducer() {
        this.excavators.add(new Excavator(20, 1));
        this.excavators.add(new Excavator(30, 2));
        this.excavators.add(new Excavator(42.5, 3.5));
    }

    @Override
    public List<Excavator> get() {
        return excavators;
    }
}

package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private final List<Excavator> excavators = new ArrayList<>();

    public ExcavatorProducer() {
        this.excavators.add(new Excavator("Berger Kraus BK800B", 25));
        this.excavators.add(new Excavator("JCB JS130LC", 15));
        this.excavators.add(new Excavator("ZIPPER ZI-MBGS600", 20));
    }

    @Override
    public List<Excavator> get() {
        return excavators;
    }
}

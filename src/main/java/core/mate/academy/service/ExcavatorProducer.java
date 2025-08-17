package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private List<Excavator> excavators = new ArrayList<>();

    public ExcavatorProducer() {
        excavators.add(new Excavator("Lifter", "Black", 0.024));
        excavators.add(new Excavator("XGMA", "Black", 0.024));
    }

    @Override
    public List<Excavator> get() {
        return excavators;
    }
}

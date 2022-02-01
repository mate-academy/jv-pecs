package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private List<Excavator> excavators = new ArrayList<>();

    @Override
    public List<Excavator> get() {
        for (int i = 0; i < 10; i++) {
            excavators.add(new Excavator());
        }
        return excavators;
    }
}

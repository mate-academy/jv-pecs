package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducerImpl implements MachineProducer<Excavator> {
    private static final List<Excavator> excavators = new ArrayList<>();

    {
        excavators.add(new Excavator(96, "ground"));
        excavators.add(new Excavator(9632, "sand"));
        excavators.add(new Excavator(100, "water"));
        excavators.add(new Excavator(546.32, "rock"));
    }

    @Override
    public List<Excavator> get() {
        return excavators;
    }
}

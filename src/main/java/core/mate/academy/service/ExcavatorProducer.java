package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private List<Excavator> excavators = new ArrayList<>();

    @Override
    public List<Excavator> get() {
        excavators.add(new Excavator(1, "Shorty"));
        excavators.add(new Excavator(2, "The Worker"));
        excavators.add(new Excavator(3, "Big Brother"));
        return excavators;
    }
}

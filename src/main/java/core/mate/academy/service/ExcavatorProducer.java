package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("Long-reach", "Bucket"));
        excavators.add(new Excavator(" Short swing radius", "Ripper"));
        excavators.add(new Excavator("Wheeled", "Augers"));
        return excavators;
    }
}

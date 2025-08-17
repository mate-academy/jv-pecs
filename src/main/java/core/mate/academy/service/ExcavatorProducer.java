package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator(11, 21));
        excavators.add(new Excavator(12, 22));
        excavators.add(new Excavator(13, 23));
        return excavators;
    }
}

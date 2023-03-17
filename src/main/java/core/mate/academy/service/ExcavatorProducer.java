package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator doosanExcavator = new Excavator("Doosan", "orange",200);
        Excavator hitachiExcavator = new Excavator("Hitachi", "green",250);
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(doosanExcavator);
        excavators.add(hitachiExcavator);
        return excavators;
    }
}

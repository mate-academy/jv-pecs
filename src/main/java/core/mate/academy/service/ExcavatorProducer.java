package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("caterpillar", "type1"));
        excavators.add(new Excavator("caterpillar", "type2"));
        excavators.add(new Excavator("wheeled", "type3"));
        return excavators;
    }
}

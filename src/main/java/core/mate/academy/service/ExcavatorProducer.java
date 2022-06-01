package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator(100500, 50, "Brand1"));
        excavators.add(new Excavator(100501, 60, "Brand2"));
        excavators.add(new Excavator(100502, 70, "Brand3"));
        excavators.add(new Excavator(100503, 80, "Brand4"));
        excavators.add(new Excavator(100504, 90, "Brand5"));
        return excavators;
    }
}

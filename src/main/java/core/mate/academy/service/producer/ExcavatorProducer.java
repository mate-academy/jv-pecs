package core.mate.academy.service.producer;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("Excavator1", "Orange", 1.2, 10.0));
        excavators.add(new Excavator("Excavator2", "Orange", 1.5, 12.0));
        excavators.add(new Excavator("Excavator3", "Orange", 1.8, 14.0));
        return excavators;
    }
}

package core.mate.academy.producer;

import core.mate.academy.model.Excavator;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    @Override
    public List<Excavator> get() {
        Excavator newExcavator = new Excavator();
        Excavator rustExcavator = new Excavator();
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(newExcavator);
        excavators.add(rustExcavator);
        return excavators;
    }
}

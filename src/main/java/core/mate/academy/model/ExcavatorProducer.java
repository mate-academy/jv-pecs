package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator(8, "Caterpillar"));
        excavators.add(new Excavator(20, "Wheeled"));
        excavators.add(new Excavator(12, "Wheeled"));
        return excavators;
    }
}

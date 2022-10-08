package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator(50, "Chine"));
        excavators.add(new Excavator(100, "Germany"));
        excavators.add(new Excavator(120, "USA"));
        return excavators;
    }
}

package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("JCB", "yellow", 8.1));
        excavators.add(new Excavator("Hitachi", "orange", 7.6));
        excavators.add(new Excavator("Hyundai", "red", 4.8));
        return excavators;
    }
}

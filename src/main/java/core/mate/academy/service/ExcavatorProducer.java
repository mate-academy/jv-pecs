package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("Liebherr", "white", 45.0));
        excavators.add(new Excavator("Hyundai", "yellow", 6.7));
        excavators.add(new Excavator("Volvo", "black", 6.0));
        return excavators;
    }
}

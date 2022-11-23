package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("Hitachi", "green", "MQ98", 145));
        excavators.add(new Excavator("Hyundai", "black", "YU78", 98));
        excavators.add(new Excavator("Sany", "grey", "VRY34", 123));
        return excavators;
    }
}

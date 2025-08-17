package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ProducerExcavator implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("Excavator", "green", 1000000, "with hidden power! =)"));
        excavators.add(new Excavator("Excavator", "yellow", 1000, "with supper wheels"));
        excavators.add(new Excavator("Excavator", "white", 100, "with something unbelievable"));
        return excavators;
    }
}

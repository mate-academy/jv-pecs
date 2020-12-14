package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("Handler", "Brown", 5));
        excavators.add(new Excavator("Grabber", "Red", 4));
        excavators.add(new Excavator("Bandit", "White", 6));
        return excavators;
    }
}

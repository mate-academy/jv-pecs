package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> machines = new ArrayList<>();
        Excavator excavator = new Excavator();
        excavator.setName("Big Ex");
        excavator.setColor("Green");
        machines.add(excavator);
        excavator = new Excavator();
        excavator.setName("Small Ex");
        excavator.setColor("Blue");
        machines.add(excavator);
        return machines;
    }
}

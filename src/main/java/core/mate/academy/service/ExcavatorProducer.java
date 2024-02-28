package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        List<Excavator> machines = new ArrayList<>();
        machines.add(new Excavator("Black", "Nissan", 3));
        machines.add(new Excavator("White", "Volvo", 4));
        machines.add(new Excavator("Yellow", "Cat", 5));
        return machines;
    }
}

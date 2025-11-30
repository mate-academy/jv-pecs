package core.mate.academy.impl;

import core.mate.academy.model.Excavator;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        ArrayList<Excavator> machines = new ArrayList<>();
        machines.add(new Excavator());
        machines.add(new Excavator());

        return machines;
    }
}

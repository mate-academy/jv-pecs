package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        ArrayList<Excavator> machines = new ArrayList<>();
        for (int i = 0; i < MACHINES_NUMBER; i++) {
            machines.add(new Excavator());
        }
        return machines;
    }
}

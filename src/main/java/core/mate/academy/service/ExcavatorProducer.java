package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private List<Excavator> machines = new ArrayList<>();

    @Override
    public List<Excavator> get() {
        createModels();
        return machines;
    }

    private void createModels() {
        machines.add(new Excavator("Excavator1", "Orange"));
        machines.add(new Excavator("Excavator2", "Green"));
        machines.add(new Excavator("Excavator3", "Grey"));
    }
}

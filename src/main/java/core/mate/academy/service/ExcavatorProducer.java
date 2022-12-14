package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    private List<Machine> machines;

    public ExcavatorProducer() {
        this.machines = new ArrayList<>();
        fillList();
    }

    @Override
    public List<Machine> get() {
        return machines;
    }

    private void fillList() {
        machines.add(new Excavator(7, 10));
        machines.add(new Excavator(5, 5));
    }
}

package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Machine> {
    private List<Machine> machines;

    public TruckProducer() {
        this.machines = new ArrayList<>();
        fillList();
    }

    private void fillList() {
        machines.add(new Truck(400, 6));
        machines.add(new Truck(550, 8));
    }

    @Override
    public List<Machine> get() {
        return machines;
    }
}

package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;

import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {

    @Override
    public List<? extends Machine> getAll(Class<Machine> type) {
        // Determine the appropriate MachineProducer based on the class type
        MachineProducer<? extends Machine> producer;
        if (type.equals(Bulldozer.class)) {
            producer = new BulldozerProducer();
        } else if (type.equals(Excavator.class)) {
            producer = new ExcavatorProducer();
        } else if (type.equals(Truck.class)) {
            producer = new TruckProducer();
        } else {
            throw new IllegalArgumentException("Unsupported machine type");
        }
        return producer.get();
    }

    @Override
    public void fill(List<Machine> machines, Machine value) {
        // Fill the machines list with the passed value
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<Machine> machines) {
        // Call doWork() on each machine
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}

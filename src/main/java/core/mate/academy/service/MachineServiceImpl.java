package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.Collections;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List getAll(Class type) {
        MachineProducer machineProducer = null;
        if (type.equals(Bulldozer.class)) {
            machineProducer = new BulldozerProducer();
            return machineProducer.get();
        }
        if (type.equals(Truck.class)) {
            machineProducer = new TruckProducer();
            return machineProducer.get();
        }
        if (type.equals(Excavator.class)) {
            machineProducer = new ExcavatorProducer();
            return machineProducer.get();
        }
        return machineProducer != null ? machineProducer.get() : Collections.emptyList();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        int size = machines.size();
        for (int i = 0; i < size; i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> list) {
        for (Machine machine : list) {
            machine.doWork();
        }
    }
}

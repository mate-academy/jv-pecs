package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.Collections;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        MachineProducer machineProducer = null;
        if (Bulldozer.class.equals(type)) {
            machineProducer = new BulldozerProducer();
        }
        if (Truck.class.equals(type)) {
            machineProducer = new TruckProducer();
        }
        if (Excavator.class.equals(type)) {
            machineProducer = new ExcavatorProducer();
        }
        return machineProducer != null ? machineProducer.get() : Collections.emptyList();
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        int size = machines.size();
        for (int i = 0; i < size; i++) {
            machines.set(i, value);
        }
    }
}

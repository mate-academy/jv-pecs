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
public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    @Override
    public List<? extends Machine> getAll(Class<? extends T> type) {
        MachineProducer machineProducer;
        if (Bulldozer.class.equals(type)) {
            machineProducer = new BulldozerProducer();
            return machineProducer.get();
        }
        if (Truck.class.equals(type)) {
            machineProducer = new TruckProducer();
            return machineProducer.get();
        }
        if (Excavator.class.equals(type)) {
            machineProducer = new ExcavatorProducer();
            return machineProducer.get();
        }
        return Collections.emptyList();
    }

    @Override
    public void fill(List<? super Machine> machines, T value) {
        int size = machines.size();
        for (int i = 0; i < size; i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}

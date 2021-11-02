package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl<T extends Machine> implements MachineService<T> {

    @Override
    public List<T> getAll(Class<? extends T> type) {
        MachineProducer machineProducer;
        if (type == Bulldozer.class) {
            machineProducer = new BulldozerProducer();
            return machineProducer.get();
        }
        if (type == Excavator.class) {
            machineProducer = new ExcavatorProducer();
            return machineProducer.get();
        }
        if (type == Truck.class) {
            machineProducer = new TruckProducer();
            return machineProducer.get();
        }
        return new ArrayList<>();
    }

    @Override
    public void fill(List<? super T> machines, T value) {
        Collections.fill(machines, value);
    }

    @Override
    public void startWorking(List<? extends T> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}

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
    public <T extends Machine> List<Machine> getAll(Class<T> type) {
        MachineProducer machineProducer = null;
        if (type == Bulldozer.class) {
            machineProducer = new BulldozerProducer();
        }
        if (type == Truck.class) {
            machineProducer = new TruckProducer();
        }
        if (type == Excavator.class) {
            machineProducer = new ExcavatorProducer();
        }
        if (machineProducer == null) {
            return Collections.emptyList();
        }
        return machineProducer.get();
    }

    @Override
    public <T extends Machine> void fill(List<? super Machine> machines, Machine machine) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public <T extends Machine> void startWorking(List<T> machines) {
        for (T machine : machines) {
            machine.doWork();
        }
    }
}

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
public class MachineServiceImpl<T extends Machine> implements MachineService<Machine> {

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        MachineProducer machineProducer = null;
        if (type.equals(Bulldozer.class)) {
            machineProducer = new BulldozerProducer();
        } else if (type.equals(Truck.class)) {
            machineProducer = new TruckProducer();
        } else if (type.equals(Excavator.class)) {
            machineProducer = new ExcavatorProducer();
        }
        return machineProducer != null ? machineProducer.get() : new ArrayList<>();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        Collections.fill(machines, value);
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}

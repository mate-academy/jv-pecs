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
    public List<? extends Machine> getAll(Class<? extends T> type) {
        MachineProducer machineProducer;
        if (type.equals(Bulldozer.class)) {
            machineProducer = new BulldozerProducer();
            return machineProducer.get();
        } else if (type.equals(Truck.class)) {
            machineProducer = new TruckProducer();
            return machineProducer.get();
        } else if (type.equals(Excavator.class)) {
            machineProducer = new ExcavatorProducer();
            return machineProducer.get();
        }
        return new ArrayList<>();
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

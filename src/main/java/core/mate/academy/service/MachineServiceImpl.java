package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl<T extends Machine> implements MachineService<Machine> {
    @Override
    public List<? extends Machine> getAll(Class type) {
        MachineProducer machineProducer = null;
        List<? extends Machine> listOfMachines;
        if (type.equals(Bulldozer.class)) {
            machineProducer = new BulldozerProducer();
        }
        if (type.equals(Excavator.class)) {
            machineProducer = new ExcavatorProducer();
        }
        if (type.equals(Truck.class)) {
            machineProducer = new TruckProducer();
        }
        return machineProducer != null ? machineProducer.get() : new ArrayList<>();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
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

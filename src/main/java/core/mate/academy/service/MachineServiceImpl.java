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
        if (Excavator.class.equals(type)) {
            machineProducer = new ExcavatorProducer();
        } else if (Bulldozer.class.equals(type)) {
            machineProducer = new BulldozerProducer();
                } else if (Truck.class.equals(type)) {
            machineProducer = new TruckProducer();
        }
        return machineProducer == null ? Collections.emptyList() : machineProducer.get();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine: machines) {
            machine.doWork();
        }
    }
}

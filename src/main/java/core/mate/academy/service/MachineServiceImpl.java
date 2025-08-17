package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        MachineProducer machineProducer;
        if (!Machine.class.isAssignableFrom(type)) {
            return new ArrayList<>();
        }
        switch (type.getSimpleName()) {
            case "Bulldozer":
                machineProducer = new BulldozerProducer();
                return machineProducer.get();
            case "Excavator":
                machineProducer = new ExcavatorProducer();
                return machineProducer.get();
            case "Truck":
                machineProducer = new TruckProducer();
                return machineProducer.get();
            default:
                return new ArrayList<>();
        }
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

package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    @Override
    public List<T> getAll(Class<? extends T> type) {
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
    public void fill(List<? super T> machines, T value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends T> machines) {
        for (T machine : machines) {
            ((Machine) machine).doWork();
        }
    }
}

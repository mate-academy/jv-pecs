package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    @Override
    public List<T> getAll(Class<? extends T> type) {
        MachineProducer machineProducer;
        switch (type.getName()) {
            case "core.mate.academy.model.Bulldozer":
                machineProducer = new BulldozerProducer();
                break;
            case "core.mate.academy.model.Truck":
                machineProducer = new TruckProducer();
                break;
            case "core.mate.academy.model.Excavator":
                machineProducer = new ExcavatorProducer();
                break;
            default:
                machineProducer = null;
        }
        if (machineProducer != null) {
            List<? extends T> machines = machineProducer.get();
            return new ArrayList<>(machines);
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

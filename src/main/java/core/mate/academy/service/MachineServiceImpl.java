package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;

import java.util.Collections;
import java.util.List;

public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    @Override
    public List<T> getAll(Class<? extends T> type) {

        MachineProducer machineProducer = null;

        if (Bulldozer.class.equals(type)) {
            machineProducer = new BulldozerProducer();
        } else if (Truck.class.equals(type)) {
            machineProducer = new TruckProducer();
        } else if (Excavator.class.equals(type)) {
            machineProducer = new ExcavatorProducer();
        }
        if (machineProducer != null) {
            return machineProducer.get();
        } else {
            return Collections.emptyList();
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
            machine.doWork();
        }
    }
}

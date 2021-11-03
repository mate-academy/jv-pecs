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
        MachineProducer<? extends Machine> machineProducer;
        if (type == Bulldozer.class) {
            machineProducer = new BulldozerProducer();
        } else if (type == Truck.class) {
            machineProducer = new TruckProducer();
        } else if (type == Excavator.class) {
            machineProducer = new ExcavatorProducer();
        } else {
            return Collections.emptyList();
        }
        return (List<T>) machineProducer.get();
    }

    @Override
    public void fill(List<? super T> machines, T value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends T> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}

package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    @Override
    public List<Machine> getAll(Class<? extends T> type) {
        MachineProducer machineProducer = getProducerByType(type);
        if (machineProducer == null) {
            return new ArrayList<>();
        }
        return machineProducer.get();
    }

    @Override
    public void fill(List<? super T> machines, T value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends T> list) {
        for (T machine : list) {
            machine.doWork();
        }
    }

    private MachineProducer getProducerByType(Class<? extends T> type) {
        if (Bulldozer.class.equals(type)) {
            return new BulldozerProducer();
        } else if (Truck.class.equals(type)) {
            return new TruckProducer();
        } else if (Excavator.class.equals(type)) {
            return new ExcavatorProducer();
        }
        return null;
    }
}

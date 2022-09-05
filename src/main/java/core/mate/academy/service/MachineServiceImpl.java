package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Truck;
import core.mate.academy.model.Workable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl<T> implements MachineService<T> {

    private final Map<Class<?>, Object> implementations = new HashMap<>();

    public MachineServiceImpl() {
        implementations.put(Bulldozer.class, new BulldozerProducer());
        implementations.put(Excavator.class, new ExcavatorProducer());
        implementations.put(Truck.class, new TruckProducer());
    }

    @Override
    public List<T> getAll(Class<? extends T> type) {
        MachineProducer<T> machineProducer = (MachineProducer<T>) implementations.get(type);
        return machineProducer == null ? new ArrayList<>() : machineProducer.get();
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
            ((Workable) machine).doWork();
        }
    }
}

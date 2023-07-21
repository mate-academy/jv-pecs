package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.service.impl.BulldozerProducer;
import core.mate.academy.service.impl.ExcavatorProducer;
import core.mate.academy.service.impl.TruckProducer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    private final HashMap<Class<?>, MachineProducer<? extends Machine>> map;

    {
        map = new HashMap<>();
        map.put(Truck.class, new TruckProducer());
        map.put(Excavator.class, new ExcavatorProducer());
        map.put(Bulldozer.class, new BulldozerProducer());
    }

    @Override
    public List<T> getAll(Class<? extends T> type) {
        if (map.get(type) != null) {
            MachineProducer<T> machineProducer = (MachineProducer<T>) map.get(type);
            return new ArrayList<>(machineProducer.get());
        }
        return new ArrayList<>();
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

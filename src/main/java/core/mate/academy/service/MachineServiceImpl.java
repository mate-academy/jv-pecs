package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    private static Map<Class<?>, MachineProducer> producerMap = new HashMap();

    static {
        producerMap.put(Bulldozer.class, new BulldozerProducer());
        producerMap.put(Excavator.class, new ExcavatorProducer());
        producerMap.put(Truck.class, new TruckProducer());
    }

    @Override
    public List<T> getAll(Class type) {
        MachineProducer producer = producerMap.get(type);
        if (producer == null) {
            return new ArrayList<>();
        }
        return producer.get();
    }

    @Override
    public void fill(List<? super T> machines, T value) {
        for (int i = 0; i < machines.size(); ++i) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends T> machines) {
        for (Machine machine: machines) {
            machine.doWork();
        }
    }
}

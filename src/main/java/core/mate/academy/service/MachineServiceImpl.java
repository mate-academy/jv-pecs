package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MachineServiceImpl implements MachineService<Machine> {
    private final Map<Class<? extends Machine>, MachineProducer<? extends Machine>> producerMap;

    {
        producerMap = new HashMap<>();
        producerMap.put(Bulldozer.class, new BulldozerProducer());
        producerMap.put(Excavator.class, new ExcavatorProducer());
        producerMap.put(Truck.class, new TruckProducer());
    }

    @SuppressWarnings("unchecked")
    @Override
    public <V extends Machine> List<V> getAll(Class<? extends Machine> type) {
        MachineProducer<? extends Machine> producer = producerMap.get(type);
        return producer == null ? new ArrayList<>() : (List<V>)producer.get();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        Collections.fill(machines, value);
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine: machines) {
            machine.doWork();
        }
    }
}

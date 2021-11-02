package core.mate.academy.service;

import core.mate.academy.model.*;
import core.mate.academy.service.producer.BulldozerProducer;
import core.mate.academy.service.producer.ExcavatorProducer;
import core.mate.academy.service.producer.MachineProducer;
import core.mate.academy.service.producer.TruckProducer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    private final HashMap<Class<? extends Machine>, MachineProducer> machineTypeMap = mapCreate();

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (machineTypeMap.containsKey(type)) {
            return new ArrayList<>(machineTypeMap.get(type).get());
        }
        return Collections.emptyList();
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

    private HashMap<Class<? extends Machine>, MachineProducer> mapCreate() {
        HashMap<Class<? extends Machine>, MachineProducer> hashMap = new HashMap<>();
        hashMap.put(Bulldozer.class, new BulldozerProducer());
        hashMap.put(Truck.class, new TruckProducer());
        hashMap.put(Excavator.class, new ExcavatorProducer());
        return hashMap;
    }
}

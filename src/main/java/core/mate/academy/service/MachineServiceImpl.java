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
    public MachineServiceImpl() {
        producerMap = new HashMap<>();
        producerMap.put(Bulldozer.class, new BuildozerProducer());
        producerMap.put(Excavator.class, new ExcavatorProducer());
        producerMap.put(Truck.class, new TruckProducer());
    }

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        MachineProducer<? extends Machine> machineProducer = producerMap.get(type);
        if (machineProducer != null) {
            return new ArrayList<>(machineProducer.get());
        } else {
            return Collections.emptyList();
        }
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}

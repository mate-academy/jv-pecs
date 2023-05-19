package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.service.impl.BulldozerProducer;
import core.mate.academy.service.impl.ExcavatorProducer;
import core.mate.academy.service.impl.TruckProducer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MachineServiceImpl implements MachineService<Machine> {
    private final Map<String, MachineProducer<? extends Machine>> producerMap;

    {
        producerMap = new HashMap<>();
        producerMap.put("Bulldozer", new BulldozerProducer());
        producerMap.put("Truck", new TruckProducer());
        producerMap.put("Excavator", new ExcavatorProducer());
    }

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        MachineProducer<? extends Machine> machineProducer = producerMap.get(type.getSimpleName());
        return machineProducer == null
                ? Collections.emptyList()
                : new ArrayList<>(machineProducer.get());
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

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
    private final Map<Class<? extends Machine>,
                MachineProducer<? extends Machine>> machineProducerMap =
            new HashMap<>();

    public MachineServiceImpl() {
        machineProducerMap.put(Truck.class, new TruckProducer());
        machineProducerMap.put(Excavator.class, new ExcavatorProducer());
        machineProducerMap.put(Bulldozer.class, new BulldozerProducer());
    }

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        MachineProducer<? extends Machine> machineProducer =
                machineProducerMap.get(type);
        if (machineProducer != null) {
            return new ArrayList<>(machineProducer.get());
        } else {
            return new ArrayList<>();
        }
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        Collections.fill(machines, value);

    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}

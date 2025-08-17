package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.model.Workable;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    private final MachineStrategy machineStrategy;

    public MachineServiceImpl() {
        Map<Class<? extends Machine>, MachineProducer<? extends Machine>> machineToProducerMap =
                new HashMap<>();
        machineToProducerMap.put(Bulldozer.class, new MachineProducerBulldozer());
        machineToProducerMap.put(Excavator.class, new MachineProducerExcavator());
        machineToProducerMap.put(Truck.class, new MachineProducerTruck());
        machineStrategy = new MachineStrategyImpl(machineToProducerMap);
    }

    @Override
    public List<T> getAll(Class<? extends T> type) {
        MachineProducer<? extends Machine> machineProducer = machineStrategy.get(type);
        return machineProducer != null ? (List<T>) machineProducer.get() : Collections.emptyList();
    }

    @Override
    public void fill(List<? super Machine> machines, T value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Workable> machines) {
        for (Workable machine : machines) {
            machine.doWork();
        }
    }
}

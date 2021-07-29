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

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    private static final Map<Class<?>, MachineProducer<? extends Machine>> implementations =
            new HashMap<>();

    static {
        implementations.put(Bulldozer.class, new BulldozerProducerImpl());
        implementations.put(Excavator.class, new ExcavatorProducerImpl());
        implementations.put(Truck.class, new TruckProducerImpl());
    }

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        MachineProducer<? extends Machine> machine = implementations.get(type);
        if (machine == null) {
            return Collections.emptyList();
        }
        return new ArrayList<>(machine.get());
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

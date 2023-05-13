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
    private static final Map<Class<? extends Machine>, MachineProducer<? extends Machine>>
            PRODUCER_MAP = new HashMap<>();

    public MachineServiceImpl() {
        PRODUCER_MAP.put(Bulldozer.class, new BulldozerProducer());
        PRODUCER_MAP.put(Truck.class, new TruckProducer());
        PRODUCER_MAP.put(Excavator.class, new ExcavatorProducer());
    }

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        MachineProducer<? extends Machine> producer = PRODUCER_MAP.get(type);
        if (producer != null) {
            return new ArrayList<>(producer.get());
        }
        return Collections.emptyList();
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

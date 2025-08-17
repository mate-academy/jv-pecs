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

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {

    private final Map<Class<? extends Machine>, MachineProducer<? extends Machine>>
            producers = new HashMap<>() {{
                            put(Bulldozer.class, new BulldozerProducer());
                            put(Excavator.class, new ExcavatorProducer());
                            put(Truck.class, new TruckProducer());
                    }};

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        MachineProducer<? extends Machine> producer = producers.get(type);
        return producer == null ? Collections.emptyList() : List.copyOf(producer.get());
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        Collections.fill(machines, value);
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        machines.forEach(Workable::doWork);
    }
}

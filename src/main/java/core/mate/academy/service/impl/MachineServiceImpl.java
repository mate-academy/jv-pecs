package core.mate.academy.service.impl;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.model.Workable;
import core.mate.academy.service.MachineProducer;
import core.mate.academy.service.MachineService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class MachineServiceImpl implements MachineService<Machine> {
    private final Map<Class<? extends Machine>, MachineProducer<? extends Machine>> map;

    {
        map = new HashMap<>();
        map.put(Bulldozer.class, new BulldozerProducer());
        map.put(Excavator.class, new ExcavatorProducer());
        map.put(Truck.class, new TruckProducer());
    }

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (map.containsKey(type)) {
            return new ArrayList<>(map.get(type).get());
        }
        return Collections.emptyList();
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        machines.forEach(Workable::doWork);
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        IntStream.range(0, machines.size())
                .forEach(index -> machines.set(index, value));
    }
}

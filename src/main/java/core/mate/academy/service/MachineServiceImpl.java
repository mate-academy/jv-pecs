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
    private static final Map<Class<? extends Machine>,
            MachineProducer<? extends Machine>> MACHINES_MAP = new HashMap<>();

    public MachineServiceImpl() {
        MACHINES_MAP.put(Bulldozer.class, new BulldozerProducer());
        MACHINES_MAP.put(Excavator.class, new ExcavatorProducer());
        MACHINES_MAP.put(Truck.class, new TruckProducer());
    }

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (MACHINES_MAP.get(type) == null) {
            return Collections.emptyList();
        }
        List<? extends Machine> list = MACHINES_MAP.get(type).get();
        return new ArrayList<>(list);
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        Collections.fill(machines, value);
    }

    @Override
    public void startWorking(List<? extends Machine> list) {
        for (Machine machine : list) {
            machine.doWork();
        }
    }
}

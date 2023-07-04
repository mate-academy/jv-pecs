package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.service.impl.BulldozerProducer;
import core.mate.academy.service.impl.ExcavatorProducer;
import core.mate.academy.service.impl.TruckProducer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    private final HashMap<String, MachineProducer<? extends Machine>> map;

    {
        map = new HashMap<>();
        map.put("Truck", new TruckProducer());
        map.put("Excavator", new ExcavatorProducer());
        map.put("Bulldozer", new BulldozerProducer());
    }

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (map.get(type.getSimpleName()) != null) {
            MachineProducer<? extends Machine> machineProducer = map.get(type.getSimpleName());
            List<? extends Machine> machines = machineProducer.get();
            return new ArrayList<>(machines);
        }
        return new ArrayList<>();
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

package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MachineServiceImpl implements MachineService<Machine> {
    private Map<Class<? extends Machine>, MachineProducer<? extends Machine>> producers;

    public MachineServiceImpl() {
        producers = new HashMap<>();
        producers.put(Bulldozer.class, new BulldozerProducer());
        producers.put(Excavator.class, new ExcavatorProducer());
        producers.put(Truck.class, new TruckProducer());
    }

    @Override
    public List<Machine> getAll(Class type) {
        List<Machine> machines = new ArrayList<>();
        MachineProducer<? extends Machine> producer = producers.get(type);
        if (producer != null) {
            machines.addAll(producer.get());
        }
        return machines;
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

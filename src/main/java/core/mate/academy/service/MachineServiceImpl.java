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
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        MachineProducer<?> producer = getProducersMap().get(type);
        return producer != null ? new ArrayList<>(producer.get()) : new ArrayList<>();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        machines.replaceAll(ignored -> value);
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }

    private Map<Class<?>, MachineProducer<?>> getProducersMap() {
        HashMap<Class<?>, MachineProducer<?>> producers = new HashMap<>();
        producers.put(Excavator.class, new ExcavatorProducer());
        producers.put(Truck.class, new TruckProducer());
        producers.put(Bulldozer.class, new BulldozerProducer());
        return producers;
    }
}

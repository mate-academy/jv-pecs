package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    private final HashMap<Class<? extends Machine>, MachineProducer<? extends Machine>> producers;

    public MachineServiceImpl() {
        producers = new HashMap<>();
        producers.put(Bulldozer.class, new BulldozerProducer());
        producers.put(Excavator.class, new ExcavatorProducer());
        producers.put(Truck.class, new TruckProducer());
    }

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        MachineProducer<?> producer = producers.get(type);

        if (producer == null) {
            return new ArrayList<>();
        }

        List<? extends Machine> list = producer.get();
        return new ArrayList<>(list);
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

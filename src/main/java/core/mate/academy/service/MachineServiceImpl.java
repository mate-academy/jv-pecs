package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    private HashMap<String, MachineProducer<? extends Machine>> producers = new HashMap<>();

    public MachineServiceImpl() {
        producers.put(Bulldozer.class.getName(), new BulldozerProducer());
        producers.put(Excavator.class.getName(), new ExcavatorProducer());
        producers.put(Truck.class.getName(), new TruckProducer());
    }

    @Override
    public List<Machine> getAll(Class type) {
        MachineProducer<? extends Machine> producer = producers.get(type.getName());
        List<? extends Machine> machines = producer == null ? new ArrayList<>() : producer.get();
        return new ArrayList<>(machines);
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

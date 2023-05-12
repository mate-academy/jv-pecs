package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class MachineServiceImpl implements MachineService<Machine> {
    private final Map<Class<? extends Machine>, MachineProducer<? extends Machine>> machines
            = Map.of(
            Bulldozer.class,new BulldozerProducer(),
            Excavator.class,new ExcavatorProducer(),
            Truck.class, new TruckProducer());

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (machines.containsKey(type)) {
            return (List<Machine>) machines.get(type).get();
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

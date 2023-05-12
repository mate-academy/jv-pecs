package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class MachineServiceImpl implements MachineService<Machine> {
    private Map<Class<? extends Machine>, List<Machine>> machines;

    public MachineServiceImpl() {
        this.machines = Map.of(Bulldozer.class, new BulldozerProducer().get(),
                Excavator.class, new ExcavatorProducer().get(),
                Truck.class, new TruckProducer().get());
    }

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        return (machines.get(type) != null) ? machines.get(type) : Collections.emptyList();
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        int size = machines.size();
        for (int i = 0; i < size; i++) {
            machines.set(i, value);
        }
    }
}

package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.Collections;
import java.util.List;

public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    private final BulldozerProducer bulldozer;
    private final ExcavatorProducer excavator;
    private final TruckProducer truck;

    public MachineServiceImpl() {
        bulldozer = new BulldozerProducer();
        excavator = new ExcavatorProducer();
        truck = new TruckProducer();
    }

    @Override
    public List<T> getAll(Class<? extends Machine> type) {
        if (Bulldozer.class.equals(type)) {
            return (List<T>) bulldozer.get();
        }
        if (Excavator.class.equals(type)) {
            return (List<T>) excavator.get();
        }
        if (Truck.class.equals(type)) {
            return (List<T>) truck.get();
        }
        return Collections.emptyList();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        int number = machines.size();
        for (int i = 0; i < number; i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        if (machines == null) {
            throw new RuntimeException("No machines in list");
        }
        for (Machine m : machines) {
            m.doWork();
        }
    }
}

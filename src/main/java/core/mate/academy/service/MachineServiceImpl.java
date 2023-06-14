package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.Collections;
import java.util.List;

public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    private final BulldozerProducer bulldozerProducer = new BulldozerProducer();
    private final ExcavatorProducer excavatorProducer = new ExcavatorProducer();
    private final TruckProducer truckProducer = new TruckProducer();

    @Override
    public List<T> getAll(Class<? extends Machine> type) {
        if (type.equals(Bulldozer.class)) {
            return (List<T>) bulldozerProducer.get();
        }
        if (type.equals(Excavator.class)) {
            return (List<T>) excavatorProducer.get();
        }
        if (type.equals(Truck.class)) {
            return (List<T>) truckProducer.get();
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
        if (machines == null) {
            throw new RuntimeException("No machines in list");
        }
        for (Machine m : machines) {
            m.doWork();
        }
    }
}

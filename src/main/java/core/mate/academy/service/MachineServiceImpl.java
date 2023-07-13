package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    private final BulldozerProducer bulldozerProducer = new BulldozerProducer();
    private final ExcavatorProducer excavatorProducer = new ExcavatorProducer();
    private final TruckProducer truckProducer = new TruckProducer();

    @Override
    public List<T> getAll(Class<? extends T> type) {
        List<? extends Machine> machines = Collections.emptyList();
        if (type.equals(Bulldozer.class)) {
            machines = bulldozerProducer.get();
        } else if (type.equals(Excavator.class)) {
            machines = excavatorProducer.get();
        } else if (type.equals(Truck.class)) {
            machines = truckProducer.get();
        }
        return (List<T>) new ArrayList<>(machines);
    }

    @Override
    public void fill(List<? super T> machines, T value) {
        machines.replaceAll(ignored -> value);
    }

    @Override
    public void startWorking(List<? extends T> machines) {
        for (T machine : machines) {
            machine.doWork();
        }
    }
}

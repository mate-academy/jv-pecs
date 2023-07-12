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
        List<? extends T> machines = Collections.emptyList();
        if (type == Bulldozer.class) {
            machines = (List<? extends T>) bulldozerProducer.get();
        } else if (type.equals(Excavator.class)) {
            machines = (List<? extends T>) excavatorProducer.get();
        } else if (type.equals(Truck.class)) {
            machines = (List<? extends T>) truckProducer.get();
        }
        return new ArrayList<>(machines);
    }

    @Override
    public void fill(List<? super T> machines, T value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends T> machines) {
        for (T machine : machines) {
            machine.doWork();
        }
    }
}

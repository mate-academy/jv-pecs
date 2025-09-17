package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    @Override
    public List<T> getAll(Class<? extends T> type) {
        List<? extends T> machines = Collections.emptyList();

        if (type == Bulldozer.class) {
            machines = (List<? extends T>) new BulldozerProducer().get();
        } else if (type == Excavator.class) {
            machines = (List<? extends T>) new ExcavatorProducer().get();
        } else if (type == Truck.class) {
            machines = (List<? extends T>) new TruckProducer().get();
        }
        return new ArrayList<>((List<T>) machines);
    }

    @Override
    public void fill(List<? super T> machines, T value) {
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

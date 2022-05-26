package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Truck;
import core.mate.academy.model.Machine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl<T> implements MachineService<T> {
    public MachineServiceImpl() {
    }

    @Override
    public List<T> getAll(Class<? extends Machine> type) {
        if (type == Bulldozer.class) {
            return (List<T>) new BulldozerProducer().get();
        } else if (Excavator.class.equals(type)) {
            return (List<T>) new ExcavatorProducer().get();
        } else if (Truck.class.equals(type)) {
            return (List<T>) new TruckProducer().get();
        }
        return new ArrayList<>();
    }

    @Override
    public void fill(List<? super T> machines, T value) {
        Collections.fill(machines, value);
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}

package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl<T extends Machine> implements MachineService<T> {

    @Override
    public List<T> getAll(Class<? extends T> type) {
        if (type == Bulldozer.class) {
            return (List<T>) new BulldozerProducer().get();
        }
        if (type == Excavator.class) {
            return (List<T>) new ExcavatorProducer().get();
        }
        if (type == Truck.class) {
            return (List<T>) new TruckProducer().get();
        }
        return new ArrayList<>();
    }

    @Override
    public void fill(List<? super Machine> machines, T value) {
        machines.replaceAll(ignored -> value);
    }

    @Override
    public void startWorking(List<? extends T> machines) {
        for (T machine: machines) {
            machine.doWork();
        }
    }
}

package core.mate.academy.service;

import core.mate.academy.BulldozerProducer;
import core.mate.academy.ExcavatorProducer;
import core.mate.academy.TruckProducer;
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
        List<T> listEmpty = new ArrayList<>();
        if (type == Bulldozer.class) {
            return (List<T>) new BulldozerProducer().get();
        }
        if (type == Excavator.class) {
            return (List<T>) new ExcavatorProducer().get();
        }
        if (type == Truck.class) {
            return (List<T>) new TruckProducer().get();
        }
        return listEmpty;
    }

    @Override
    public void fill(List<? super T> machines, T value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends T> machines) {
        for (T elements : machines) {
            elements.doWork();
        }
    }
}

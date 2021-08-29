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
    private static final Class<Bulldozer> BULLDOZER = Bulldozer.class;
    private static final Class<Excavator> EXCAVATOR = Excavator.class;
    private static final Class<Truck> TRUCK = Truck.class;

    @Override
    public List<T> getAll(Class<? extends T> type) {
        List<T> resultList;
        if (type.equals(BULLDOZER)) {
            return (List<T>) new BulldozerProducer().get();
        } else if (type.equals(EXCAVATOR)) {
            return (List<T>) new ExcavatorProducer().get();
        } else if (type.equals(TRUCK)) {
            return (List<T>) new TruckProducer().get();
        }
        return new ArrayList<>();
    }

    @Override
    public void fill(List<? super T> machines, T value) {
        int size = machines.size();
        for (int i = 0; i < size; i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends T> machines) {
        for (T item : machines) {
            item.doWork();
        }
    }
}

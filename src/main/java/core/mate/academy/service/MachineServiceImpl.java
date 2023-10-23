package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    @Override
    public List<T> getAll(Class<? extends T> type) {
        if (type == Bulldozer.class) {
            return (List<T>) new ArrayList<>(new BulldozerProducer().get());
        } else if (type == Excavator.class) {
            return (List<T>) new ArrayList<>(new ExcavatorProducer().get());
        } else if (type == Truck.class) {
            return (List<T>) new ArrayList<>(new TruckProducer().get());
        } else {
            return new ArrayList<>();
        }
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
        for (T machine : machines) {
            machine.doWork();
        }
    }
}

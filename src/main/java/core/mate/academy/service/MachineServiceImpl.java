package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;
import model.producer.BulldozerProducer;
import model.producer.ExcavatorProducer;
import model.producer.TruckProducer;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    @Override
    public List<T> getAll(Class<? extends T> type) {
        if (type == Bulldozer.class) {
            return (List<T>) new BulldozerProducer().get();
        } else if (type == Excavator.class) {
            return (List<T>) new ExcavatorProducer().get();
        } else if (type == Truck.class) {
            return (List<T>) new TruckProducer().get();
        } else {
            return new ArrayList<>();
        }
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
            if (machine instanceof Bulldozer) {
                ((Bulldozer) machine).doWork();
            } else if (machine instanceof Excavator) {
                ((Excavator) machine).doWork();
            } else if (machine instanceof Truck) {
                ((Truck) machine).doWork();
            }
        }
    }
}

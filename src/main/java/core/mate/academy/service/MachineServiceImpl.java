package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.producers.BulldozerProducer;
import core.mate.academy.producers.ExcavatorProducer;
import core.mate.academy.producers.TruckProducer;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    @Override
    public List getAll(Class<? extends T> type) {
        if (type.equals(Truck.class)) {
            return new TruckProducer().get();
        } else if (type.equals(Excavator.class)) {
            return new ExcavatorProducer().get();
        } else if (type.equals(Bulldozer.class)) {
            return new BulldozerProducer().get();
        } else {
            return List.of();
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

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

public class MachineServiceImpl<E extends Machine> implements MachineService<E> {
    @Override
    public List<Machine> getAll(Class<? extends E> type) {
        List<Machine> machines = new ArrayList<>();
        if (type.equals(Bulldozer.class)) {
            machines.addAll(new BulldozerProducer().get());
        }
        if (type.equals(Excavator.class)) {
            machines.addAll(new ExcavatorProducer().get());
        }
        if (type.equals(Truck.class)) {
            machines.addAll(new TruckProducer().get());
        }
        return machines;
    }

    @Override
    public void fill(List<? super E> machines, E value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends E> machines) {
        for (E machine : machines) {
            machine.doWork();
        }
    }
}

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
    public List<Machine> getAll(Class<? extends T> type) {
        if (type.equals(Bulldozer.class)) {
            return new ArrayList<>(new BulldozerProducer().get());
        } else if (type.equals(Excavator.class)) {
            return new ArrayList<>(new ExcavatorProducer().get());
        } else if (type.equals(Truck.class)) {
            return new ArrayList<>(new TruckProducer().get());
        }
        return new ArrayList<>();
    }

    @Override
    public void fill(List<? super T> machines, T value) {
        machines.replaceAll(machine -> value);
    }

    @Override
    public void startWorking(List<? extends T> machines) {
        machines.forEach(Machine::doWork);
    }
}

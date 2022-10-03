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
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type != null && type.equals(Bulldozer.class)) {
            return new ArrayList<>(new BulldozerProducer().get());
        }
        if (type != null && type.equals(Excavator.class)) {
            return new ArrayList<>(new ExcavatorProducer().get());
        }
        if (type != null && type.equals(Truck.class)) {
            return new ArrayList<>(new TruckProducer().get());
        }
        return new ArrayList<>();
    }

    @Override
    public void fill(List<? super Machine> machines, T value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<?extends T> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}

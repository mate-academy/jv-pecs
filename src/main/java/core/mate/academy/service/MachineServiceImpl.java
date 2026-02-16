package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type == Truck.class) {
            List<? extends Machine> machines = new TruckProducer().get();
            return new ArrayList<>(machines);
        }
        if (type == Bulldozer.class) {
            List<? extends Machine> machines = new BulldozerProducer().get();
            return new ArrayList<>(machines);
        }
        if (type == Excavator.class) {
            List<? extends Machine> machines = new ExcavatorProducer().get();
            return new ArrayList<>(machines);
        }
        return List.of();
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

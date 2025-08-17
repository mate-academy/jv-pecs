package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.strategy.BulldozerProducer;
import core.mate.academy.strategy.ExcavatorProducer;
import core.mate.academy.strategy.TruckProducer;
import java.util.Collections;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    @Override
    public List<T> getAll(Class<? extends T> type) {
        MachineProducer machineProducer = null;
        if (type.equals(Bulldozer.class)) {
            machineProducer = new BulldozerProducer();
        } else if (type.equals(Truck.class)) {
            machineProducer = new TruckProducer();
        } else if (type.equals(Excavator.class)) {
            machineProducer = new ExcavatorProducer();
        }
        return machineProducer == null
                ? Collections.emptyList()
                : machineProducer.get();
    }

    @Override
    public void fill(List<? super T> machines, T value) {
        Collections.fill(machines, value);
    }

    @Override
    public void startWorking(List<? extends T> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}

package core.mate.academy.service;

import static java.util.Collections.emptyList;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        MachineProducer<Machine> producer = null;
        if (Bulldozer.class == type) {
            producer = new BulldozerProducer();
        } else if (Truck.class.equals(type)) {
            producer = new TruckProducer();
        } else if (Excavator.class.equals(type)) {
            producer = new ExcavatorProducer();
        }
        return producer == null ? emptyList() : producer.get();
    }

    @Override
    public void fill(List<Object> machines, T value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}

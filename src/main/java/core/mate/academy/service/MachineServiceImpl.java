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
    public List<T> getAll(Class type) {
        List<T> machines = new ArrayList<>();
        MachineProducer producer;

        if (Bulldozer.class.equals(type)) {
            producer = new BulldozerProducer();
            machines = producer.get();
        } else if (Excavator.class.equals(type)) {
            producer = new ExcavatorProducer();
            machines = producer.get();
        } else if (Truck.class.equals(type)) {
            producer = new TruckProducer();
            machines = producer.get();
        }

        return machines;
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
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}

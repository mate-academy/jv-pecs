package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.BulldozerProducer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.ExcavatorProducer;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.model.TruckProducer;
import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl<T> implements MachineService<T> {

    @Override
    public List<Machine> getAll(Class type) {
        MachineProducer<Machine> machines = null;

        if (type == Bulldozer.class) {
            machines = new BulldozerProducer();
        } else if (type == Excavator.class) {
            machines = new ExcavatorProducer();
        } else if (type == Truck.class) {
            machines = new TruckProducer();
        } else {
            return new ArrayList<>();
        }

        return machines.get();
    }

    @Override
    public void fill(List<? super T> machines, T value) {
        int size = machines.size();
        for (int i = 0; i < size; i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine record: machines) {
            record.doWork();
        }
    }
}

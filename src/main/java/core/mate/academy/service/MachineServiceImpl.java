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
    public List<T> getAll(Class<? extends T> type) {
        if (type == Bulldozer.class) {
            return new BulldozerProducer().get();

        } else if (type == Truck.class) {
            return new TruckProducer().get();

        } else if (type == Excavator.class) {
            return new ExcavatorProducer().get();
        }

        return new ArrayList<>();
    }

    @Override
    public void fill(List<? super T> machines, T value) {
        if (machines.size() == 0) {
            for (int i = 0; i < 3; i++) {
                machines.add(i, value);
            }
            return;
        }

        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends T> list) {
        for (Machine machine: list) {
            machine.doWork();
        }
    }
}

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
        return (List<T>) machines;
    }

    @Override
    public void fill(List<? super T> machines, T value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends T> list) {
        for (Machine m : list) {
            m.doWork();
        }
    }
}

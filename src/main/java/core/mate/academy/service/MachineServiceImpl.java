package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    @Override
    @SuppressWarnings("unchecked")
    public List<T> getAll(Class<? extends T> type) {
        List<? extends Machine> machines = new ArrayList<>();
        if (type == Bulldozer.class) {
            machines = new BulldozerProducer().get();
        }
        if (type == Excavator.class) {
            machines = new ExcavatorProducer().get();
        }
        if (type == Truck.class) {
            machines = new TruckProducer().get();
        }
        return (List<T>) machines;
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

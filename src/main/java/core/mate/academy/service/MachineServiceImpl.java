package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.LinkedList;
import java.util.List;

public class MachineServiceImpl<T extends Machine> implements MachineService<T> {

    @Override
    public List<Machine> getAll(Class<? extends T> machines) {
        if (machines.equals(Bulldozer.class)) {
            return new LinkedList<>(new BulldozerProducer().get());
        } else if (machines.equals(Excavator.class)) {
            return new LinkedList<>(new ExcavatorProducer().get());
        } else if (machines.equals(Truck.class)) {
            return new LinkedList<>(new TruckProducer().get());
        }
        return new LinkedList<>();
    }

    @Override
    public void fill(List<? super T> machines, T value) {
        for (int i = 0; i < machines.size(); i++) {
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

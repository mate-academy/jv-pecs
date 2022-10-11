package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    @Override
    public List<T> getAll(Class<? extends T> type) {
        switch (type.getSimpleName()) {
            case "Truck":
                return (List<T>) new TruckProducer().get();
            case "Bulldozer":
                return (List<T>) new BulldozerProducer().get();
            case "Excavator":
                return (List<T>) new ExcavatorProducer().get();
            default:
                return new ArrayList<T>();
        }
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

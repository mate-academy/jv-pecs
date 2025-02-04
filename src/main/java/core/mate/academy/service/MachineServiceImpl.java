package core.mate.academy.service;

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
    public List<T> getAll(Class<? extends T> type) {
        if (type.equals(Bulldozer.class)) {
            return (List<T>) List.of(new Bulldozer());
        } else if (type.equals(Excavator.class)) {
            return (List<T>) List.of(new Excavator());
        } else if (type.equals(Truck.class)) {
            return (List<T>) List.of(new Truck());
        } else {
            return List.of();
        }
    }

    @Override
    public void fill(List<? super T> machines, T value) {
        if (machines.isEmpty()) {
            return;
        }
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends T> machines) {

    }
}

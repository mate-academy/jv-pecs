package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.model.Workable;
import java.util.Collections;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl<T extends Machine> implements MachineService<T> {

    @Override
    public List<T> getAll(Class<? extends T> type) {
        if (Bulldozer.class.equals(type)) {
            return (List<T>) new MachineProducerBulldozer().get();
        } else if (Excavator.class.equals(type)) {
            return (List<T>) new MachineProducerExcavator().get();
        } else if (Truck.class.equals(type)) {
            return (List<T>) new MachineProducerTruck().get();
        }
        return Collections.EMPTY_LIST;
    }

    @Override
    public void fill(List<? super Machine> machines, T value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Workable> machines) {
        for (Workable machine : machines) {
            machine.doWork();
        }
    }
}

package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.LinkedList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {

    @Override
    public List<Machine> getAll(Class type) {
        if (Bulldozer.class.equals(type)) {
            return new LinkedList<>(new BulldozerProducer().get());
        }
        if (Excavator.class.equals(type)) {
            return new LinkedList<>(new ExcavatorProducer().get());
        }
        if (Truck.class.equals(type)) {
            return new LinkedList<>(new TruckProducer().get());
        }
        return new LinkedList<>();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        int size = machines.size();
        for (int i = 0; i < size; i++) {
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

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
public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<Machine> machines = new ArrayList<>();

        if (type.equals(Bulldozer.class)) {
            machines = new BulldozerProducer().get();
            return machines;

        } else if (type.equals(Excavator.class)) {
            machines = new ExcavatorProducer().get();
            return machines;
        } else if (type.equals(Truck.class)) {
            machines = new TruckProducer().get();
            return machines;
        }
        return machines;
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        if (machines == null) {
            return;
        }

        int size = machines.size();

        for (int i = 0; i < size; i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        if (machines == null) {
            return;
        }

        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}

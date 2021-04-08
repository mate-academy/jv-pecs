package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.Collections;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<? extends Machine> getAll(Class type) {
        List<? extends Machine> machines = Collections.emptyList();
        if (type == Bulldozer.class) {
            machines = new BulldozerProducer().get();
        } else if (type == Truck.class) {
            machines = new TruckProducer().get();
        } else if (type == Excavator.class) {
            machines = new ExcavatorProducer().get();
        }
        return machines;
    }

    @Override
    public void fill(List machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (int i = 0; i < machines.size(); i++) {
            machines.get(i).doWork();
        }
    }
}

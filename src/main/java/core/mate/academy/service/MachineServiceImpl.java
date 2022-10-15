package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class type) {
        if (type == Bulldozer.class) {
            return new BulldozerProduced().get();
        } else if (type == Excavator.class) {
            return new ExcavatorProducer().get();
        } else if (type == Truck.class) {
            return new TruckProducer().get();
        }
        return new ArrayList<>();
    }

    @Override
    public void fill(List machines, Object value) {
        Collections.fill(machines, value);
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        if (machines != null) {
            for (Machine machine : machines) {
                machine.doWork();
            }
        }
    }
}

package core.mate.academy.service;

import core.mate.academy.model.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {

    @Override
    public List getAll(Class<? extends Machine> type) {
        if (type == Bulldozer.class) {
            return new BulldozerProducer().get();
        }
        if (type == Truck.class) {
            return new TruckProducer().get();
        }
        if (type == Excavator.class) {
            return new ExcavatorProducer().get();
        } else {
            return new ArrayList();
        }
    }

    @Override
    public void fill(List machines, Object value) {
        for (int i = 0; i < machines.size(); i++) {
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

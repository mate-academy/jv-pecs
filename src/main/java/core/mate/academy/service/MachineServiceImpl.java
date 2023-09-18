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
public class MachineServiceImpl<T> implements MachineService {
    @Override
    public List getAll(Class type) {
        if (Bulldozer.class.equals(type)) {
            return new BulldozerProducer().get();
        }
        if (Excavator.class.equals(type)) {
            return new ExcavatorProducer().get();
        }
        if (Truck.class.equals(type)) {
            return new TruckProducer().get();
        }
        return new ArrayList<Machine>();
    }

    @Override
    public void fill(List machines, Object value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List list) {
        for (Object value: list) {
            ((Machine) value).doWork();
        }
    }
}

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
public class MachineServiceImpl implements MachineService {

    @Override
    public List<? extends Machine> getAll(Class type) {
        if (type.equals(Truck.class)) {
            return new TruckProducer().get();
        } else if (type.equals(Excavator.class)) {
            return new ExcavatorProducer().get();
        } else if (type.equals(Bulldozer.class)) {
            return new BulldozerProducer().get();
        }
        return new ArrayList<>();
    }

    @Override
    public void fill(List machines, Object value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List list) {
        if (list.get(0) instanceof Truck) {
            new Truck().doWork();
            return;
        }
        if (list.get(0) instanceof Excavator) {
            new Excavator().doWork();
            return;
        }
        if (list.get(0) instanceof Bulldozer) {
            new Bulldozer().doWork();
        }
    }
}

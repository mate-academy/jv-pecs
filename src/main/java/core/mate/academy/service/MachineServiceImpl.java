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
            return new Truck().get();
        } else if (type.equals(Excavator.class)) {
            return new Excavator().get();
        } else if (type.equals(Bulldozer.class)) {
            return new Bulldozer().get();
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
        if (list.equals(Truck.class)) {
            new Truck().doWork();
        } else if (list.equals(Excavator.class)) {
            new Excavator().doWork();
        } else if (list.equals(Bulldozer.class)) {
            new Bulldozer().doWork();
        }
    }
}

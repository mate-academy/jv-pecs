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
    public List getAll(Class type) {
        if (type.equals(Bulldozer.class)) {
            return new BulldozerProducer().get();
        } else if (type.equals(Excavator.class)) {
            return new ExcavatorProducer().get();
        } else if (type.equals(Truck.class)) {
            return new TruckProducer().get();
        }
        return new ArrayList<Machine>();
    }

    @Override
    public void fill(List machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List machines) {
        for (int i = 0; i < machines.size(); i++) {
            Machine machine = (Machine) machines.get(i);
            machine.doWork();
        }
    }
}

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
    public List getAll(Class type) {
        if (type == Truck.class) {
            return new ArrayList<>(new TruckProducer().get());
        } else if (type == Excavator.class) {
            return new ArrayList<>(new ExcavatorProducer().get());
        } else if (type == Bulldozer.class) {
            return new ArrayList<>(new BulldozerProducer().get());
        } else {
            return new ArrayList<>();
        }
    }

    @Override
    public void fill(List machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
    }
}

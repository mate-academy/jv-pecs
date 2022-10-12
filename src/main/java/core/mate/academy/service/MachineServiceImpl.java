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
        MachineProducer<? extends Machine> machines;
        if (type == Truck.class) {
            machines = new TruckProducer();
        } else if (type == Excavator.class) {
            machines = new ExcavatorProducer();
        } else if (type == Bulldozer.class) {
            machines = new BulldozerProducer();
        } else {
            return new ArrayList<>();
        }
        return machines.get();
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

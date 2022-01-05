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
    public List<Machine> getAll(Class type) {
        if (type == Bulldozer.class) {
            BulldozerProducer bulldozer = new BulldozerProducer();
            return bulldozer.get();
        }

        if (type == Excavator.class) {
            ExcavatorProducer excavator = new ExcavatorProducer();
            return excavator.get();
        }

        if (type == Truck.class) {
            TruckProducer truck = new TruckProducer();
            return truck.get();
        }
        return new ArrayList<>();
    }

    @Override
    public void fill(List machines, Machine value) {
        int i = 0;
        for (Object machine : machines) {
            machines.set(i, value);
            i++;
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}

package core.mate.academy.service;

import static java.util.Collections.emptyList;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (Bulldozer.class == type) {
            return new BulldozerProducer().get();
        } else if (Truck.class == type) {
            return new TruckProducer().get();
        } else if (Excavator.class == type) {
            return new ExcavatorProducer().get();
        }
        return emptyList();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
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

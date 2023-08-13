package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.model.Workable;
import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class type) {
        if (Bulldozer.class == type) {
            List<? extends Machine> machines = new BulldozerProducer().get();
            return new ArrayList<>(machines);
        } else if (Excavator.class == type) {
            List<? extends Machine> machines = new ExcavatorProducer().get();
            return new ArrayList<>(machines);
        } else if (Truck.class == type) {
            List<? extends Machine> machines = new TruckProducer().get();
            return new ArrayList<>(machines);
        }
        return new ArrayList<>();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Workable machine : machines) {
            machine.doWork();
        }
    }
}

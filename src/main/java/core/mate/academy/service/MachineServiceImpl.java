package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(final Class<? extends Machine> type) {
        if (type == Bulldozer.class) {
            return new ArrayList<>(new BulldozerProducer().get());
        }
        if (type == Excavator.class) {
            return new ArrayList<>(new ExcavatorProducer().get());
        }
        if (type == Truck.class) {
            return new ArrayList<>(new TruckProducer().get());
        }
        return new ArrayList<>();
    }

    @Override
    public void fill(final List<? super Machine> machines, final Machine value) {
        Collections.fill(machines, value);
    }

    @Override
    public void startWorking(final List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}

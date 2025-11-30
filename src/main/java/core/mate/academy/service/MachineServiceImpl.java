package core.mate.academy.service;

import core.mate.academy.impl.BulldozerProducer;
import core.mate.academy.impl.ExcavatorProducer;
import core.mate.academy.impl.TruckProducer;
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
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<? extends Machine> machines;
        if (type.equals(Bulldozer.class)) {
            // If type is Bulldozer.class, T must be Bulldozer
            machines = new BulldozerProducer().get();
        } else if (type.equals(Excavator.class)) {
            // If type is Excavator.class, T must be Excavator
            machines = new ExcavatorProducer().get();
        } else if (type.equals(Truck.class)) {
            // If type is Truck.class, T must be Truck
            machines = new TruckProducer().get();
        } else {
            // Handle all other types safely
            machines = Collections.emptyList();
        }

        return new ArrayList<>(machines);
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        Collections.fill(machines, value);
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}

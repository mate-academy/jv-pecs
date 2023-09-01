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
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<? extends Machine> machines = Collections.emptyList();
        if (Bulldozer.class.isAssignableFrom(type)) {
            BulldozerProducer bulldozerProducer = new BulldozerProducer();
            machines = bulldozerProducer.get();
        } else if (Excavator.class.isAssignableFrom(type)) {
            ExcavatorProducer excavatorProducer = new ExcavatorProducer();
            machines = excavatorProducer.get();
        } else if (Truck.class.isAssignableFrom(type)) {
            TruckProducer truckProducer = new TruckProducer();
            machines = truckProducer.get();
        }
        return new ArrayList<>(machines);
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
    }
}

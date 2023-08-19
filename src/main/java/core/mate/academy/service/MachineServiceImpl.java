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
    private final BulldozerProducer bulldozerProducer = new BulldozerProducer();
    private final TruckProducer truckProducer = new TruckProducer();
    private final ExcavatorProducer excavatorProducer = new ExcavatorProducer();

    @Override
    public List<Machine> getAll(Class type) {
        List<? extends Machine> machines = null;
        if (type == Bulldozer.class) {
            machines = bulldozerProducer.get();
        }
        if (type == Excavator.class) {
            machines = excavatorProducer.get();
        }
        if (type == Truck.class) {
            machines = truckProducer.get();
        }
        return machines == null ? List.of() : new ArrayList<>(machines);
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

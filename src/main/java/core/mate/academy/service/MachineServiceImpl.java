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
    private final BulldozerProducer bulldozerProducer;
    private final TruckProducer truckProducer;
    private final ExcavatorProducer excavatorProducer;

    public MachineServiceImpl() {
        bulldozerProducer = new BulldozerProducer();
        truckProducer = new TruckProducer();
        excavatorProducer = new ExcavatorProducer();
    }

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (Bulldozer.class.equals(type)) {
            return new ArrayList<>(bulldozerProducer.get());
        }
        if (Truck.class.equals(type)) {
            return new ArrayList<>(truckProducer.get());
        }
        if (Excavator.class.equals(type)) {
            return new ArrayList<>(excavatorProducer.get());
        }
        return Collections.emptyList();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        machines.replaceAll(item -> value);
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        machines.forEach(Machine::doWork);
    }
}

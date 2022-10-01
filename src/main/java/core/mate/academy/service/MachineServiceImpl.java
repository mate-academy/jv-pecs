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
public class MachineServiceImpl implements MachineService {
    @Override
    public List<? extends Machine> getAll(Class type) {
        List<? extends Machine> machines;
        MachineProducer<? extends Machine> machineProducer;
        if (type.equals(Bulldozer.class)) {
            machineProducer = new BulldozerProducer();
        } else if (type.equals(Excavator.class)) {
            machineProducer = new ExcavatorProducer();
        } else if (type.equals(Truck.class)) {
            machineProducer = new TruckProducer();
        } else {
            return new ArrayList<>();
        }
        machines = machineProducer.get();
        return machines;
    }

    @Override
    public void fill(List machines, Object value) {
        machines.replaceAll(ignored -> value);
    }

    @Override
    public void startWorking(List list) {

    }
}

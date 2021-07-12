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
public class MachineServiceImpl <T extends Machine> implements MachineService {
    @Override
    public List getAll(Class type) {
        MachineProducer machineProducer;
        if (type == Truck.class) {
            machineProducer = new TruckProducer();
        } else if (type == Bulldozer.class) {
            machineProducer = new BulldozerProducer();
        } else if (type == Excavator.class) {
            machineProducer = new ExcavatorProducer();
        } else {
            return new ArrayList();
        }
        return (List<Machine>) machineProducer.get();
    }

    @Override
    public void fill(List machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List machines) {
        for (Object machine : machines) {
            Machine m = (Machine)machine;
            m.doWork();
        }
    }
}

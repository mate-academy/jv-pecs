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
        List<? extends Machine> machines = null;
        if (type.getName().equals(Bulldozer.class.getName())) {
            machines = new BulldozerProducer().get();
        }
        if (type.getName().equals(Excavator.class.getName())) {
            machines = new ExcavatorProducer().get();
        }
        if (type.getName().equals(Truck.class.getName())) {
            machines = new TruckProducer().get();
        }
        if (type.getName().equals(Machine.class.getName())) {
            machines = List.of();
        }
        return new ArrayList<>(machines);
    }

    @Override
    public <T extends Machine> void fill(List<? super Machine> machines, T value) {
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

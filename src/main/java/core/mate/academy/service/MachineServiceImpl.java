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
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<? extends Machine> machines;
        if (Truck.class.equals(type)) {
            machines = new TruckProducer().get();
        } else if (Bulldozer.class.equals(type)) {
            machines = new BulldozerProducer().get();
        } else if (Excavator.class.equals(type)) {
            machines = new ExcavatorProducer().get();
        } else {
            machines = new ArrayList<>();
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
        if (machines == null) {
            throw new RuntimeException("We don`t have machines in the list");
        }
        for (Machine m : machines) {
            m.doWork();
        }
    }
}

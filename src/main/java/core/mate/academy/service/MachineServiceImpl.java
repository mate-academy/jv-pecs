package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<Machine> machines = new LinkedList<>();
        if (type.equals(Bulldozer.class)) {
            machines.addAll(new BulldozerProducer().get());
        } else if (type.equals(Excavator.class)) {
            machines.addAll(new ExcavatorProducer().get());
        } else if (type.equals(Truck.class)) {
            machines.addAll(new TruckProducer().get());
        } else {
            machines = Collections.emptyList();
        }
        return machines;
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        Collections.fill(machines, value);
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine: machines) {
            machine.doWork();
        }
    }
}

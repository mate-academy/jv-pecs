package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<? extends Machine> machines;
        if (Bulldozer.class.equals(type)) {
            machines = new BulldozerProducer().get();
        } else if (Excavator.class.equals(type)) {
            machines = new ExcavatorProducer().get();
        } else if (Truck.class.equals(type)) {
            machines = new TruckProducer().get();
        } else {
            machines = Collections.emptyList();
        }
        return new ArrayList<>(machines);
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }

    @Override
    public void fill(List<? super Machine> machines, Machine machine) {
        Collections.fill(machines, machine);
    }
}

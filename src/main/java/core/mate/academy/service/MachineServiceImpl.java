package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    private List<? extends Machine> machines = new ArrayList<>();

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type.equals(Bulldozer.class)) {
            machines = new BulldozerProducer().get();
        } else if (type.equals(Excavator.class)) {
            machines = new ExcavatorProducer().get();
        } else if (type.equals(Truck.class)) {
            machines = new TruckProducer().get();
        } else {
            return new ArrayList<>();
        }
        return (List<Machine>) machines;
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        Collections.fill(machines, value);
    }
}

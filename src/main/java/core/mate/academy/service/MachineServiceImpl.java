package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService {
    @Override
    public List getAll(Class type) {
        List<? extends Machine> machines = new ArrayList<>();
        if (type == Bulldozer.class) {
            machines = new BulldozerProducer().get();
        }
        if (type == Excavator.class) {
            machines = new ExcavatorProducer().get();
        }
        if (type == Truck.class) {
            machines = new TruckProducer().get();
        }
        return machines;
    }

    @Override
    public void fill(List machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List list) {
        List<? extends Machine> machines = list;
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}

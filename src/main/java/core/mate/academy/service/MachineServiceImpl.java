package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService {
    private MachineProducer machines;

    @Override
    public List<? extends Machine> getAll(Class type) {
        if (type == Bulldozer.class) {
            machines = new BulldozerProducer();
            return machines.get();
        }
        if (type == Excavator.class) {
            machines = new ExcavatorProducer();
            return machines.get();
        }
        if (type == Truck.class) {
            machines = new TruckProducer();
            return machines.get();
        }
        return new ArrayList<>();
    }

    @Override
    public void fill(List machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List list) {
    }
}

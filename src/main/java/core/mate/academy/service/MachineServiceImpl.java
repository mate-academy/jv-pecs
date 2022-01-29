package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List getAll(Class type) {
        if (type.equals(Bulldozer.class)) {
            return new BulldozerProducer().get();
        } else if (type.equals(Excavator.class)) {
            return new ExcavatorProducer().get();
        } else if (type.equals(Truck.class)) {
            return new TruckProducer().get();
        } else {
            return new ArrayList<>();
        }
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> list) {
        for (Machine machine : list) {
            machine.doWork();
        }
    }
}

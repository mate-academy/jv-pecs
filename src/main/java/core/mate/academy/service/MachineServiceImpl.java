package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {

    @Override
    public List<? extends Machine> getAll(Class type) {
        if (type == Bulldozer.class) {
            return new BulldozerProducer().get();
        }
        if (type == Truck.class) {
            return new TruckProducer().get();
        }
        if (type == Excavator.class) {
            return new ExcavatorProducer().get();
        }
        return new ArrayList<>();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> list) {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).doWork();
        }
    }
}

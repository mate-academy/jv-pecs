package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type == Bulldozer.class) {
            List<? extends Machine> list = new BulldozerProducer().get();
            return new ArrayList<>(list);
        } else if (type == Excavator.class) {
            List<? extends Machine> list = new ExcavatorProducer().get();
            return new ArrayList<>(list);
        } else if (type == Truck.class) {
            List<? extends Machine> list = new TruckProducer().get();
            return new ArrayList<>(list);
        }
        return List.of();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        int size = machines.size();
        for (int i = 0; i < size; i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine m : machines) {
            m.doWork();
        }
    }
}


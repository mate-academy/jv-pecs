package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.BulldozerProducer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.ExcavatorProducer;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.model.TruckProducer;
import core.mate.academy.model.Workable;
import java.util.List;

public class MachineServiceImpl<T extends Machine> implements MachineService<Machine> {

    @Override
    public List getAll(Class obj) {
        if (obj == Bulldozer.class) {
            return new BulldozerProducer().get();
        } else if (obj == Excavator.class) {
            return new ExcavatorProducer().get();
        } else if (obj == Truck.class) {
            return new TruckProducer().get();
        }
        return List.of();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Workable> machines) {
        for (int i = 0; i < machines.size(); i++) {
            machines.get(i).doWork();
        }
    }
}

package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.Collections;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<? extends Machine> getAll(Class type) {
        if (type == Bulldozer.class) {
            return new BulldozerProducer().get();
        }
        if (type == Excavator.class) {
            return new ExcavatorProducer().get();
        }
        if (type == Truck.class) {
            return new TruckProducer().get();
        }
        return Collections.emptyList();
    }

    @Override
    public void startWorking(List<? extends Machine> list) {

    }

    @Override
    public void fill(List machines, Machine value) {
        Collections.fill(machines, value);
    }
}

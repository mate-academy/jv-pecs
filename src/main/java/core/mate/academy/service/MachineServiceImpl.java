package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.model.Workable;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    private MachineProducer machineProducer;

    @Override
    public List getAll(Class<? extends Machine> type) {
        if (type == Bulldozer.class) {
            machineProducer = new BulldozerProducer();
            return machineProducer.get();
        } else if (type == Truck.class) {
            machineProducer = new TruckProducer();
            return machineProducer.get();
        } else if (type == Excavator.class) {
            machineProducer = new ExcavatorProducer();
            return machineProducer.get();
        } else {
            return new ArrayList();
        }
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        machines.forEach(Workable::doWork);
    }
}


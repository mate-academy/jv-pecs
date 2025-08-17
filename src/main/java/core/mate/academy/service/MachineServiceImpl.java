package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.Collections;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        MachineProducer producer = null;
        if (type.equals(Truck.class)) {
            producer = new TruckProducer();
        } else if (type.equals(Bulldozer.class)) {
            producer = new BulldozerProducer();
        } else if (type.equals(Excavator.class)) {
            producer = new ExcavatorProducer();
        }
        return producer != null ? producer.get() : Collections.emptyList();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}

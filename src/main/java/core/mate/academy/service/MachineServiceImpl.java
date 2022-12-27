package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.service.impl.BulldozerProducer;
import core.mate.academy.service.impl.ExcavatorProducer;
import core.mate.academy.service.impl.TruckProducer;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<? super Machine> getAll(Class type) {
        MachineProducer machineProducer;
        if (type.equals(Excavator.class)) {
            machineProducer = new ExcavatorProducer();
            return (List<Machine>) machineProducer.get();
        }
        if (type.equals(Bulldozer.class)) {
            machineProducer = new BulldozerProducer();
            return (List<Machine>) machineProducer.get();
        }
        if (type.equals(Truck.class)) {
            machineProducer = new TruckProducer();
            return (List<Machine>) machineProducer.get();
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
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}

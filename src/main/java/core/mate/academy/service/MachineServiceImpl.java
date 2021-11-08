package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class type) {
        if (type == Bulldozer.class) {
            MachineProducer bulldozerProducer = new BulldozerProducer();
            return bulldozerProducer.get();
        }
        if (type == Excavator.class) {
            MachineProducer excavatorProducer = new ExcavatorProducer();
            return excavatorProducer.get();
        }
        if (type == Truck.class) {
            MachineProducer truckProducer = new TruckProducer();
            return truckProducer.get();
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
        for (Machine machine: machines) {
            machine.doWork();
        }

    }
}

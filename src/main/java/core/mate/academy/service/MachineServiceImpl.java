package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class type) {
        List<Machine> machines = new ArrayList<>();
        if (type == Bulldozer.class) {
            MachineProducer bulldozerProducer = new BulldozerProducer();
            machines = bulldozerProducer.get();
        } else if (type == Excavator.class) {
            MachineProducer excavatorProducer = new ExcavatorProducer();
            machines = excavatorProducer.get();
        } else if (type == Truck.class) {
            MachineProducer truckProducer = new TruckProducer();
            machines = truckProducer.get();
        }
        return machines;
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        Collections.fill(machines, value);
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine: machines) {
            machine.doWork();
        }
    }
}

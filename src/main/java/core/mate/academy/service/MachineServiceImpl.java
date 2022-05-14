package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.BulldozerProducer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.ExcavatorProducer;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.model.TruckProducer;
import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService {
    @Override
    public List<? extends Machine> getAll(Class type) {
        if (type == Bulldozer.class) {
            BulldozerProducer bulldozerProducer = new BulldozerProducer();
            List<? extends Machine> machines = bulldozerProducer.get();
            return machines;
        }
        if (type == Excavator.class) {
            ExcavatorProducer excavatorProducer = new ExcavatorProducer();
            List<? extends Machine> machines = excavatorProducer.get();
            return machines;
        }
        if (type == Truck.class) {
            TruckProducer truckProducer = new TruckProducer();
            List<? extends Machine> machines = truckProducer.get();
            return machines;
        }
        return new ArrayList<>();
    }

    @Override
    public void startWorking(List machines) {
        for (int i = 0; i < machines.size(); i++) {
            Machine machine = (Machine) machines.get(i);
            machine.doWork();
        }
    }

    @Override
    public void fill(List machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }
}

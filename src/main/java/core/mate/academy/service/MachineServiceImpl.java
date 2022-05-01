package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;
/**
 * Your implementation of MachineService.
 */

public class MachineServiceImpl implements MachineService<Machine> {

    @Override
    public List<? extends Machine> getAll(Object type) {
        List<? extends Machine> machines = new ArrayList<>();
        if (type == Bulldozer.class) {
            BulldozerProducer bulldozerProducer = new BulldozerProducer();
            machines = bulldozerProducer.get();
        }
        if (type == Excavator.class) {
            ExcavatorProducer excavatorProducer = new ExcavatorProducer();
            machines = excavatorProducer.get();
        }
        if (type == Truck.class) {
            TruckProducer truckProducer = new TruckProducer();
            machines = truckProducer.get();
        }
        return machines;
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

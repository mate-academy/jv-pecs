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
    public List<? extends Machine> getAll(Class type) {
        List<? extends Machine> machines = new ArrayList<>();
        if (Bulldozer.class.equals(type)) {
            BulldozerProducer bulldozer = new BulldozerProducer();
            machines = bulldozer.get();
        }
        if (Excavator.class.equals(type)) {
            ExcavatorProducer excavatorProducer = new ExcavatorProducer();
            machines = excavatorProducer.get();
        }
        if (Truck.class.equals(type)) {
            TruckProducer truck = new TruckProducer();
            machines = truck.get();
        }
        return machines;
    }

    @Override
    public void startWorking(List<? extends Machine> list) {
        for (Machine machine: list) {
            machine.doWork();
        }
    }

    @Override
    public void fill(List list, Machine value) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i,value);
        }
    }
}

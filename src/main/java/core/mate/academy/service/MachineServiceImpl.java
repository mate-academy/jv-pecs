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
    public List<? extends Machine> getAll(Class<? extends Machine> type) {
        List<? extends Machine> machines;
        if (type == Bulldozer.class) {
            machines = new BulldozerProducer().get();
            return machines;
        }
        if (type == Excavator.class) {
            machines = new ExcavatorProducer().get();
            return machines;
        }
        if (type == Truck.class) {
            machines = new TruckProducer().get();
            return machines;
        }
        machines = new ArrayList<>();
        return machines;
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        machines.replaceAll(ignored -> value);
    }

    @Override
    public void startWorking(List<? extends Machine> list) {
        for (Machine m: list) {
            m.doWork();
        }
    }
}

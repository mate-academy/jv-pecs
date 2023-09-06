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
public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    @Override
    public List<T> getAll(Class<? extends Machine> type) {
        if (type == Bulldozer.class) {
            MachineProducer bulldozer = new BulldozerProducer();
            return bulldozer.get();
        } else if (type == Excavator.class) {
            MachineProducer excavator = new ExcavatorProducer();
            return excavator.get();
        } else if (type == Truck.class) {
            MachineProducer truck = new TruckProducer();
            return truck.get();
        } else {
            return new ArrayList<>();
        }
    }

    @Override
    public void fill(List machines, Machine value) {
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

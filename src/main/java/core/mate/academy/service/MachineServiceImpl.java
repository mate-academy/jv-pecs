package core.mate.academy.service;

import core.mate.academy.model.*;

import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl <T extends Machine> implements MachineService <Machine>{
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type == Bulldozer.class) {
            new BulldozerProducerImpl().get();
        }
        if (type == Excavator.class) {
            new ExcavatorProducerImpl().get();
        }
        if (type == Truck.class) {
            new TruckProducerImpl().get();
        }
        return null;
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        int size = machines.size();
        for (int i = 0; i < size; i++) {
            machines.add(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (int i = 0; i < machines.size(); i++) {
            machines.get(i).doWork();
        }
    }
}

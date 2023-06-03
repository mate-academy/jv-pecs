package core.mate.academy.service;

import core.mate.academy.model.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl <T extends Machine> implements MachineService <Machine>{
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
            if (type == null) {
              throw new NullPointerException("Type of machine's is null");
            }
        if (type == Bulldozer.class) {
            new BulldozerProducerImpl().get();
        }
        if (type == Excavator.class) {
            new ExcavatorProducerImpl().get();
        }
        if (type == Truck.class) {
            new TruckProducerImpl().get();
        }
        return new ArrayList<>();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        int size = machines.size();
        if (size != 0) {
            for (int i = 0; i < machines.size(); i++) {
                machines.set(i, value);
            }
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (int i = 0; i < machines.size(); i++) {
            machines.get(i).doWork();
        }
    }
}

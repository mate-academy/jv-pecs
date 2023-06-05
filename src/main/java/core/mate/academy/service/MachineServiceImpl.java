package core.mate.academy.service;

import core.mate.academy.model.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService <Machine>{
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
            List<? extends Machine> machines;
            if (type == Bulldozer.class) {
                machines = new BulldozerProducerImpl().get();
                return new ArrayList<>(machines);
            }
            if (type == Truck.class) {
                machines = new TruckProducerImpl().get();
                return new ArrayList<>(machines);
            }
            if (type == Excavator.class) {
                machines = new ExcavatorProducerImpl().get();
                return new ArrayList<>(machines);
            } else {
                return new ArrayList<>();
            }
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


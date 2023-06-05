package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.BulldozerProducerImpl;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.ExcavatorProducerImpl;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.model.TruckProducerImpl;
import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
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


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
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<Machine> list = new ArrayList<>();

        if (type.equals(Truck.class)) {
            list = new ArrayList<>(new TruckProducer().get());
        }

        if (type.equals(Excavator.class)) {
            list = new ArrayList<>(new ExcavatorProducer().get());
        }

        if (type.equals(Bulldozer.class)) {
            list = new ArrayList<>(new BulldozerProducer().get());
        }

        return list;
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i += 1) {
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

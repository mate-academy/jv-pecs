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
        List<Machine> list = null;
        if (type == Bulldozer.class) {
            list = new ArrayList<>(new BulldozerProducer().get());
        }
        if (type == Excavator.class) {
            list = new ArrayList<>(new ExcavatorProducer().get());
        }
        if (type == Truck.class) {
            list = new ArrayList<>(new TruckProducer().get());
        }

        return list;
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        machines.set(0, value);
    }

    @Override
    public void startWorking(List<? extends Machine> list) {
        for (Machine machine : list) {
            machine.doWork();
        }
    }
}

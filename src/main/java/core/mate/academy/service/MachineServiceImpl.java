package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type == Bulldozer.class) {
            return new BulldozerProducer().get();
        }
        if (type == Excavator.class) {
            return new ExcavatorProducer().get();
        }
        if (type == Truck.class) {
            return new TruckProducer().get();
        }

        return null;
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

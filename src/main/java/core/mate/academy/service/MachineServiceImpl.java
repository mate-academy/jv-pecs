package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.BulldozerProducer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.ExcavatorProducer;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.model.TruckProducer;
import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type.equals(Truck.class)) {
            return new TruckProducer().get();
        } else if (type.equals(Bulldozer.class)) {
            return new BulldozerProducer().get();
        } else if (type.equals(Excavator.class)) {
            return new ExcavatorProducer().get();
        }
        return new ArrayList<>();
    }

    @Override
    public void fill(List<? super Machine> machines, Object value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, (Machine) value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> list) {
        for (Machine machine : list) {
            machine.doWork();
        }
    }
}

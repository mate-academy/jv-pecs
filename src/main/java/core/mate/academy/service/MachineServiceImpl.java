package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.Collections;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    @Override
    @SuppressWarnings("unchecked")
    public List<T> getAll(Class<? extends Machine> type) {
        return (List<T>) ((type == Bulldozer.class) ? new BulldozerProducer().get()
                : (type == Truck.class) ? new TruckProducer().get()
                : (type == Excavator.class) ? new ExcavatorProducer().get()
                : Collections.emptyList());
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
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

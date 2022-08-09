package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List getAll(Class<? extends Machine> type) {
        if (Bulldozer.class.equals(type)) {
            return new ArrayList(new BuldozerProducer().get());
        } else if (Excavator.class.equals(type)) {
            return new ArrayList(new ExcavatorProducer().get());
        } else if (Truck.class.equals(type)) {
            return new ArrayList(new TruckProducer().get());
        }
        return new ArrayList();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        Collections.fill(machines, value);
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}

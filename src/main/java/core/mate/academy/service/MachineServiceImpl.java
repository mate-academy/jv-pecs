package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {

    @Override
    public List getAll(Class<? extends Machine> type) {
        if (type.getSimpleName().equals("Truck")) {
            return new ArrayList(new TruckProducer().get());
        }
        if (type.getSimpleName().equals("Bulldozer")) {
            return new ArrayList(new BulldozerProducer().get());
        }
        if (type.getSimpleName().equals("Excavator")) {
            return new ArrayList(new ExcavatorProducer().get());
        }
        return new ArrayList();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        Collections.fill(machines,value);
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }

    }
}

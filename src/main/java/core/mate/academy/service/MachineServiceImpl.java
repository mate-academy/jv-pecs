package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Workable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        switch (type.getSimpleName()) {
            case "Truck" :
                return new TruckProducer().get();
            case "Bulldozer" :
                return new BulldozerProducer().get();
            case "Excavator" :
                return new ExcavatorProducer().get();
            default :
                return new ArrayList<>();
        }
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        Collections.fill(machines, value);
    }

    @Override
    public void startWorking(List<? extends Workable> machines) {
        for (Workable machine : machines) {
            machine.doWork();
        }
    }
}

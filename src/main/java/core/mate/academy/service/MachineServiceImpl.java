package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    private static final String NAME_CLASS_BULLDOZER = "Bulldozer";
    private static final String NAME_CLASS_EXCAVATOR = "Excavator";
    private static final String NAME_CLASS_TRUCK = "Truck";

    @Override
    public List getAll(Class<? extends Machine> type) {
        switch (type.getSimpleName()) {
            case NAME_CLASS_BULLDOZER:
                return new BulldozerProducer().get();
            case NAME_CLASS_EXCAVATOR:
                return new ExcavatorProducer().get();
            case NAME_CLASS_TRUCK:
                return new TruckProducer().get();
            default:
                return new ArrayList<Machine>();
        }
    }

    @Override
    public void startWorking(List<? extends Machine> list) {
        for (Machine machine : list) {
            machine.doWork();
        }
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        Collections.fill(machines, value);
    }
}

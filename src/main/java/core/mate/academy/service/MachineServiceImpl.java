package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    private static final String NAME_BULLDOZER = "Bulldozer";
    private static final String NAME_TRUCK = "Truck";
    private static final String NAME_EXCAVATOR = "Excavator";

    @Override
    public List getAll(Class<? extends Machine> type) {
        switch (type.getSimpleName()) {
            case NAME_BULLDOZER:
                return new ArrayList<>(new BulldozerProducer().get());

            case NAME_EXCAVATOR:
                return new ArrayList<>(new ExcavatorProducer().get());

            case NAME_TRUCK:
                return new ArrayList<>(new TruckProducer().get());

            default:
                return new ArrayList<>();
        }
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

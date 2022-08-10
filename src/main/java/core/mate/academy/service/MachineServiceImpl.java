package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    private static final String BULLDOZER_CLASS = "Bulldozer";
    private static final String EXCAVATOR_CLASS = "Excavator";
    private static final String TRUCK_CLASS = "Truck";

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        switch (type.getTypeName()) {
            case BULLDOZER_CLASS:
                return (List<Machine>) new BulldozerProducer().get();
            case EXCAVATOR_CLASS:
                return (List<Machine>) new ExcavatorProducer().get();
            case TRUCK_CLASS:
                return (List<Machine>) new TruckProducer().get();
        }
        return new ArrayList<>();
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

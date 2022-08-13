package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    private static final String TRUCK_TYPE = "Truck";
    private static final String EXCAVATOR_TYPE = "Excavator";
    private static final String BULLDOZER_TYPE = "Bulldozer";

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        switch (type.getSimpleName()) {
            case TRUCK_TYPE :
                return new ArrayList<>(new TruckProducer().get());
            case BULLDOZER_TYPE :
                return new ArrayList<>(new BulldozerProducer().get());
            case EXCAVATOR_TYPE :
                return new ArrayList<>(new ExcavatorProducer().get());
            default :
                return new ArrayList<>();
        }
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        Collections.fill(machines, value);
    }

    @Override
    public void startWorking(List<? extends Machine> list) {
        for (Machine machine : list) {
            machine.doWork();
        }
    }
}

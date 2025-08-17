package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    private static final String BULLDOZER = "Bulldozer";
    private static final String TRUCK = "Truck";
    private static final String EXCAVATOR = "Excavator";

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        switch (type.getSimpleName()) {
            case BULLDOZER:
                return new ArrayList<>(new BulldozerProducer().get());
            case TRUCK:
                return new ArrayList<>(new TruckProducer().get());
            case EXCAVATOR:
                return new ArrayList<>(new ExcavatorProducer().get());
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

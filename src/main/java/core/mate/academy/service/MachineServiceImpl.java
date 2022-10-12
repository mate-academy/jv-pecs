package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    private static final String EXCAVATOR_SIMPLE_CLASS_NAME = "Excavator";
    private static final String TRUCK_SIMPLE_CLASS_NAME = "Truck";
    private static final String BULLDOZER_SIMPLE_CLASS_NAME = "Bulldozer";

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<? extends Machine> machines;

        switch (type.getSimpleName()) {
            case EXCAVATOR_SIMPLE_CLASS_NAME:
                machines = new ExcavatorProducer().get();
                break;
            case TRUCK_SIMPLE_CLASS_NAME:
                machines = new TruckProducer().get();
                break;
            case BULLDOZER_SIMPLE_CLASS_NAME:
                machines = new BulldozerProducer().get();
                break;
            default:
                machines = new ArrayList<>();
        }
        return new ArrayList<>(machines);
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        machines.replaceAll(ignored -> value);
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}

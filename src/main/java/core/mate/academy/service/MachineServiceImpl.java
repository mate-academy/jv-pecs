package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    private static final String BULLDOZER_CLASS = "Bulldozer";
    private static final String EXCAVATOR_CLASS = "Excavator";
    private static final String TRUCK_CLASS = "Truck";

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<? extends Machine> machines;
        machines = switch (type.getSimpleName()) {
            case BULLDOZER_CLASS -> new BulldozerProducer().get();
            case EXCAVATOR_CLASS -> new ExcavatorProducer().get();
            case TRUCK_CLASS -> new TruckProducer().get();
            default -> new ArrayList<>();
        };
        return (List<Machine>) machines;
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

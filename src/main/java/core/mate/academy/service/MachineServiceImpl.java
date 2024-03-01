package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    private static final String BULLDOZER = "Bulldozer";
    private static final String EXCAVATOR = "Excavator";
    private static final String TRUCK = "Truck";

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        MachineProducer<? extends Machine> producer;
        switch (type.getSimpleName()) {
            case BULLDOZER -> producer = new BulldozerProducer();
            case EXCAVATOR -> producer = new ExcavatorProducer();
            case TRUCK -> producer = new TruckProducer();
            default -> {
                return Collections.emptyList();
            }
        }
        return new ArrayList<>(producer.get());
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

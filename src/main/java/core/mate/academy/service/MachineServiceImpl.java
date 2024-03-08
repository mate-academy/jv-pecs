package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    private static final BulldozerProducer BULLDOZER_PRODUCER = new BulldozerProducer();
    private static final ExcavatorProducer EXCAVATOR_PRODUCER = new ExcavatorProducer();
    private static final TruckProducer TRUCK_PRODUCER = new TruckProducer();

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<? extends Machine> machines = new ArrayList<>();
        if (type == Bulldozer.class) {
            machines = BULLDOZER_PRODUCER.get();
        }
        if (type == Excavator.class) {
            machines = EXCAVATOR_PRODUCER.get();
        }
        if (type == Truck.class) {
            machines = TRUCK_PRODUCER.get();
        }
        return new ArrayList<>(machines);
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

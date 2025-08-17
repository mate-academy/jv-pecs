package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    private static final MachineProducer<Bulldozer> BULLDOZER_PRODUCER = new BulldozerProducer();
    private static final MachineProducer<Excavator> EXCAVATOR_PRODUCER = new ExcavatorProducer();
    private static final MachineProducer<Truck> TRUCK_PRODUCER = new TruckProducer();

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        switch (type.getSimpleName()) {
            case "Bulldozer":
                return new ArrayList<>(BULLDOZER_PRODUCER.get());
            case "Excavator":
                return new ArrayList<>(EXCAVATOR_PRODUCER.get());
            case "Truck":
                return new ArrayList<>(TRUCK_PRODUCER.get());
            default:
                return new ArrayList<>();
        }
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

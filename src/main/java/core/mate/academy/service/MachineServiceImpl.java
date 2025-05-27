package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    @Override
      public List<Machine> getAll(Class<? extends Machine> type) {
        MachineProducer<? extends Machine> producer = switch (type.getSimpleName()) {
            case "Bulldozer" -> new BulldozerProducer();
            case "Excavator" -> new ExcavatorProducer();
            case "Truck" -> new TruckProducer();
            default -> null;
        };

        return producer != null ? new ArrayList<>(producer.get()) : new ArrayList<>();
    }

    @Override
    public void fill(List<Machine> machines, Machine value) {
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

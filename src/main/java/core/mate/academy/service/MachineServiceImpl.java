package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        return switch (type.getSimpleName()) {
            case "Bulldozer" -> new ArrayList<>(new BulldozerProducer().get());
            case "Excavator" -> new ArrayList<>(new ExcavatorProducer().get());
            case "Truck" -> new ArrayList<>(new TruckProducer().get());
            default -> Collections.emptyList();
        };
    }

    @Override
    public void fill(List<? super T> machines, T value) {
        Collections.fill(machines, value);
    }

    @Override
    public void startWorking(List<? extends T> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}

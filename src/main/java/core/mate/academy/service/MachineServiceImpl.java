package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl<T extends Machine> implements MachineService<T> {

    @Override
    @SuppressWarnings("unchecked")
    public List<T> getAll(Class<? extends Machine> type) {
        List<? extends Machine> machines = switch (type.getSimpleName()) {
            case "Bulldozer" -> {
                MachineProducer<Bulldozer> bulldozerProducer = new BulldozerProducer();
                yield bulldozerProducer.get();
            }
            case "Excavator" -> {
                MachineProducer<Excavator> excavatorProducer = new ExcavatorProducer();
                yield excavatorProducer.get();
            }
            case "Truck" -> {
                MachineProducer<Truck> truckProducer = new TruckProducer();
                yield truckProducer.get();
            }
            default -> new ArrayList<>();
        };
        return new ArrayList<>((List<T>) machines);
    }

    @Override
    public void fill(List<? super Machine> machines, T value) {
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

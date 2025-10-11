package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    private final BulldozerProducer bulldozerProducer = new BulldozerProducer();
    private final ExcavatorProducer excavatorProducer = new ExcavatorProducer();
    private final TruckProducer truckProducer = new TruckProducer();

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<? extends Machine> rawList = switch (type.getSimpleName()) {
            case "Bulldozer" -> bulldozerProducer.get();
            case "Excavator" -> excavatorProducer.get();
            case "Truck" -> truckProducer.get();
            default -> List.of();
        };

        for (Machine machine : rawList) {
            if (!type.isInstance(machine)) {
                throw new ClassCastException(
                    "Element " + machine.getClass().getName()
                            + " is not instance of " + type.getName()
                );
            }
        }

        return new ArrayList<>(rawList);
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

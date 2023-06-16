package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    private final BulldozerProducer bulldozerProducer;
    private final ExcavatorProducer excavatorProducer;
    private final TruckProducer truckProducer;

    public MachineServiceImpl() {
        bulldozerProducer = new BulldozerProducer();
        excavatorProducer = new ExcavatorProducer();
        truckProducer = new TruckProducer();
    }

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        switch (type.getSimpleName()) {
            case "Bulldozer":
                return new ArrayList<>(bulldozerProducer.get());
            case "Excavator":
                return new ArrayList<>(excavatorProducer.get());
            case "Truck":
                return new ArrayList<>(truckProducer.get());
            default:
                return List.of();
        }
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        machines.replaceAll(machine -> value);
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        machines.forEach(Machine::doWork);
    }
}

package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    private final BulldozerProducer bulldozer = new BulldozerProducer();
    private final ExcavatorProducer excavator = new ExcavatorProducer();
    private final TruckProducer truck = new TruckProducer();

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<? extends Machine> machines = new ArrayList<>();
        if (type.equals(Bulldozer.class)) {
            return (List<Machine>) (machines = bulldozer.get());
        } else if (type.equals(Excavator.class)) {
            return (List<Machine>) (machines = excavator.get());
        } else if (type.equals(Truck.class)) {
            return (List<Machine>) (machines = truck.get());
        } else {
            machines = new ArrayList<>();
        }
        return (List<Machine>) machines;
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> list) {
    }
}

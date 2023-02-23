package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.Collections;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    private final BulldozerProducer bulldozer = new BulldozerProducer();
    private final ExcavatorProducer excavator = new ExcavatorProducer();
    private final TruckProducer truck = new TruckProducer();

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type.equals(Bulldozer.class)) {
            return (List<Machine>) bulldozer.get();
        } else if (type.equals(Excavator.class)) {
            return (List<Machine>) excavator.get();
        } else if (type.equals(Truck.class)) {
            return (List<Machine>) truck.get();
        }
        return Collections.emptyList();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> list) {
        System.out.println("Machine get started working!");
    }
}

package core.mate.academy.service;

import core.mate.academy.implementation.BulldozeProducer;
import core.mate.academy.implementation.ExcavatorProducer;
import core.mate.academy.implementation.TruckProducer;
import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.Collections;
import java.util.List;

public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    private final BulldozeProducer bulldozerProducer = new BulldozeProducer();
    private final ExcavatorProducer excavatorProducer = new ExcavatorProducer();
    private final TruckProducer truckProducer = new TruckProducer();

    @Override
    public List<T> getAll(Class<? extends Machine> type) {
        MachineProducer<? extends Machine> machineProducer = null;
        if (type == Bulldozer.class) {
            machineProducer = bulldozerProducer;
        } else if (type.equals(Excavator.class)) {
            machineProducer = excavatorProducer;
        } else if (type.equals(Truck.class)) {
            machineProducer = truckProducer;
        }
        return machineProducer == null ? Collections.emptyList() : (List<T>) machineProducer.get();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends T> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}

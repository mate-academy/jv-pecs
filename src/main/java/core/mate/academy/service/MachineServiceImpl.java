package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.service.impl.BulldozerProducer;
import core.mate.academy.service.impl.ExcavatorProducer;
import core.mate.academy.service.impl.TruckProducer;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    private final BulldozerProducer bulldozerProducer = new BulldozerProducer();
    private final ExcavatorProducer excavatorProducer = new ExcavatorProducer();
    private final TruckProducer truckProducer = new TruckProducer();

    @Override
    public List<T> getAll(Class<T> type) {
        if (type == null) {
            throw new RuntimeException("Type is null");
        } else if (type == Bulldozer.class) {
            return (List<T>) bulldozerProducer.get();
        } else if (type == Excavator.class) {
            return (List<T>) excavatorProducer.get();
        } else if (type == Truck.class) {
            return (List<T>) truckProducer.get();
        }
        return List.of();
    }

    @Override
    public void fill(List<? super T> machines, T value) {
        if (value == null) {
            throw new RuntimeException("value can't be null");
        }
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

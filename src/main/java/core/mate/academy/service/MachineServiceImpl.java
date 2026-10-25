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
    public List<T> getAll(Class<? extends T> type) {
        List<T> list = List.of();
        if (type == null) {
            throw new RuntimeException("Type can't be null");
        } else if (type == Bulldozer.class) {
            list = (List<T>) bulldozerProducer.get();
        } else if (type == Excavator.class) {
            list = (List<T>) excavatorProducer.get();
        } else if (type == Truck.class) {
            list = (List<T>) truckProducer.get();
        }
        return list;
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

package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    private static final BulldozerProducer bulldozerProducer = new BulldozerProducer();
    private static final ExcavatorProducer excavatorProducer = new ExcavatorProducer();
    private static final TruckProducer truckProducer = new TruckProducer();

    @Override
    public List<T> getAll(Class<? extends T> type) {
        if (type == Bulldozer.class) {
            return (List<T>) bulldozerProducer.get();
        } else if (type == Excavator.class) {
            return (List<T>) excavatorProducer.get();
        } else if (type == Truck.class) {
            return (List<T>) truckProducer.get();
        }
        List<T> machines = new ArrayList<>();
        return machines;
    }

    @Override
    public void fill(List<? super T> machines, T value) {
        int size = machines.size();
        for (int i = 0; i < size; i++) {
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

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
    private MachineProducer bulldozerProducer;
    private MachineProducer excavatorProducer;
    private MachineProducer truckProducer;

    @Override
    public List<T> getAll(Class<? extends T> type) {
        if (Bulldozer.class == type) {
            bulldozerProducer = new BulldozerProducer();
            return new ArrayList<>(bulldozerProducer.get());
        }
        if (Excavator.class == type) {
            excavatorProducer = new ExcavatorProducer();
            return new ArrayList<>(excavatorProducer.get());
        }
        if (Truck.class == type) {
            truckProducer = new TruckProducer();
            return new ArrayList<>(truckProducer.get());
        }
        return new ArrayList<>();
    }

    @Override
    public void fill(List<? super T> machines, T value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends T> machines) {
        for (T machine : machines) {
            machine.doWork();
        }
    }
}

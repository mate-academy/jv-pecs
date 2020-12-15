package core.mate.academy.service;

import core.mate.academy.BulldozerProducer;
import core.mate.academy.ExcavatorProducer;
import core.mate.academy.TruckProducer;
import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl<T extends Machine> implements MachineService<T> {

    @Override
    public List<T> getAll(Class<? extends T> type) {
        if (type == Bulldozer.class) {
            BulldozerProducer bulldozerProducer = new BulldozerProducer();
            return (List<T>) bulldozerProducer.get();
        }
        if (type == Excavator.class) {
            ExcavatorProducer excavatorProducer = new ExcavatorProducer();
            return (List<T>) excavatorProducer.get();
        }
        if (type == Truck.class) {
            TruckProducer truckProducer = new TruckProducer();
            return (List<T>) truckProducer.get();
        }
        return null;
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
        for (Machine m : machines) {
            m.doWork();
        }
    }
}

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

    @Override
    public List getAll(Class type) {
        ExcavatorProducer excavatorProducer = new ExcavatorProducer();
        BulldozerProducer bulldozerProducer = new BulldozerProducer();
        TruckProducer truckProducer = new TruckProducer();
        if (type == Excavator.class) {
            return excavatorProducer.get();
        }
        if (type == Bulldozer.class) {
            return bulldozerProducer.get();
        }
        if (type == Truck.class) {
            return truckProducer.get();
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
        for (int i = 0; i < machines.size(); i++) {
            machines.get(i).doWork();
        }
    }
}

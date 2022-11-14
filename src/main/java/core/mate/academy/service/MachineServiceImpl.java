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
    public List<T> getAll(Class type) {
        List<T> list = new ArrayList<>();
        if (Bulldozer.class == type) {
            MachineProducer b = new BulldozerProducer();
            list = b.get();
            return new ArrayList<>(list);
        }
        if (Excavator.class == type) {
            MachineProducer e = new ExcavatorProducer();
            list = e.get();
            return new ArrayList<>(list);
        }
        if (Truck.class == type) {
            MachineProducer t = new TruckProducer();
            list = t.get();
            return new ArrayList<>(list);
        }
        return list;
    }

    @Override
    public void fill(List<? super T> machines, T value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends T> machines) {
        for (T l : machines) {
            l.doWork();
        }
    }

}

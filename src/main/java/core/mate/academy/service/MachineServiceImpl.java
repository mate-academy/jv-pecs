package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.Collections;
import java.util.List;

public class MachineServiceImpl<T extends Machine> implements MachineService<T> {

    @Override
    public List<T> getAll(Class<? extends T> type) {
        if (type == Bulldozer.class) {
            BulldozerProducer producer = new BulldozerProducer();
            return (List<T>) producer.get();
        } else if (type == Excavator.class) {
            ExcavatorProducer producer = new ExcavatorProducer();
            return (List<T>) producer.get();
        } else if (type == Truck.class) {
            TruckProducer producer = new TruckProducer();
            return (List<T>) producer.get();
        }
        return Collections.emptyList();
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

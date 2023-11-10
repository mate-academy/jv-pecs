package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.model.producers.BulldozerProducer;
import core.mate.academy.model.producers.ExcavatorProducer;
import core.mate.academy.model.producers.TruckProducer;
import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl<T extends Machine> implements MachineService<T> {

    @Override
    public List<T> getAll(Class<? extends Machine> type) {
        if (type.equals(Bulldozer.class)) {
            BulldozerProducer producer = new BulldozerProducer();
            return (List<T>) producer.get();
        } else if (type.equals(Excavator.class)) {
            ExcavatorProducer producer = new ExcavatorProducer();
            return (List<T>) producer.get();
        } else if (type.equals(Truck.class)) {
            TruckProducer producer = new TruckProducer();
            return (List<T>) producer.get();
        } else {
            return new ArrayList<>();
        }
    }

    @Override
    public void fill(List<? super Machine> machines, T value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (int i = 0; i < machines.size(); i++) {
            machines.get(i).doWork();
        }
    }
}

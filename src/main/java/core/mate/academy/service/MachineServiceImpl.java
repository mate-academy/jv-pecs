package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.model.Workable;
import core.mate.academy.service.producers.BulldozerProducer;
import core.mate.academy.service.producers.ExcavatorProducer;
import core.mate.academy.service.producers.TruckProducer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    @Override
    public List<Machine> getAll(Class<? extends T> type) {
        List<Machine> machines = new ArrayList<>();

        if (type == Bulldozer.class) {
            machines.addAll(new BulldozerProducer().get());
            return machines;
        } else if (type == Excavator.class) {
            machines.addAll(new ExcavatorProducer().get());
            return machines;
        } else if (type == Truck.class) {
            machines.addAll(new TruckProducer().get());
            return machines;
        }

        return machines;
    }

    @Override
    public void fill(List<? super T> machines, T value) {
        Collections.fill(machines, value);
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        machines.forEach(Workable::doWork);
    }
}

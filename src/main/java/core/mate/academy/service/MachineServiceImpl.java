package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    private List<T> machines = new ArrayList<>();

    @Override
    public List<T> getAll(Class<? extends Machine> type) {
        machines.clear();
        if (type == Bulldozer.class) {
            MachineProducer<Bulldozer> producer = new BulldozerProducer();
            machines.addAll((Collection<? extends T>) producer.get());
        } else if (type == Excavator.class) {
            MachineProducer<Excavator> producer = new ExcavatorProducer();
            machines.addAll((Collection<? extends T>) producer.get());
        } else if (type == Truck.class) {
            MachineProducer<Truck> producer = new TruckProducer();
            machines.addAll((Collection<? extends T>) producer.get());
        }
        return machines;
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

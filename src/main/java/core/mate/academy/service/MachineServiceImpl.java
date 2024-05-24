package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    @SuppressWarnings("unchecked")
    @Override
    public List<T> getAll(Class<? extends T> type) {
        List<? extends Machine> machines;
        if (type == Bulldozer.class) {
            MachineProducer<Bulldozer> producer = new BulldozerProducer();
            machines = producer.get();
        } else if (type == Excavator.class) {
            MachineProducer<Excavator> producer = new ExcavatorProducer();
            machines = producer.get();
        } else if (type == Truck.class) {
            MachineProducer<Truck> producer = new TruckProducer();
            machines = producer.get();
        } else {
            machines = new ArrayList<>();
        }
        return new ArrayList<>((List<T>) machines);
    }

    @Override
    public void fill(List<? super T> machines, T value) {
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

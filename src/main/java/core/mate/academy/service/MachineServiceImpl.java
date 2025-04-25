package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {

    @Override
    public List<? extends Machine> getAll(Class<? extends Machine> type) {
        if (type == Excavator.class) {
            MachineProducer<Excavator> excavatorProducer = new ExcavatorProducer();
            return excavatorProducer.get();
        }

        if (type == Bulldozer.class) {
            MachineProducer<Bulldozer> bulldozerProducer = new BulldozerProducer();
            return bulldozerProducer.get();
        }

        if (type == Truck.class) {
            MachineProducer<Truck> truckProducer = new TruckProducer();
            return truckProducer.get();
        } else {
            return List.of();
        }

    }

    @Override
    public <T> void fill(List<Object> machines, T value) {

        Machine truck = new Truck("A", "B", "C", "D", 1);
        Machine bulldozer = new Bulldozer("A", "B", "C", "D", 1);
        Machine excavator = new Excavator("A", "B", "C", "D", 1);

        if (value instanceof Truck) {
            machines.replaceAll(ignored -> truck);
        }
        if (value instanceof Bulldozer) {
            machines.replaceAll(ignored -> bulldozer);
        }
        if (value instanceof Excavator) {
            machines.replaceAll(ignored -> excavator);
        }
    }

    @Override
    public <T> void startWorking(List<T> machines) {
        for (Machine excavator : getAll(Excavator.class)) {
            excavator.doWork();
        }
        for (Machine truck : getAll(Truck.class)) {
            truck.doWork();
        }
        for (Machine bulldozer : getAll(Bulldozer.class)) {
            bulldozer.doWork();
        }
    }
}

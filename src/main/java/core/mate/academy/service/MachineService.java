package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.List;

public interface MachineService<T extends Machine> {
    List<MachineProducer> machineProducers = List.of(
            new BulldozerProducer(), new ExcavatorProducer(), new TruckProducer());
    List<Class> classes = List.of(
            Bulldozer.class, Excavator.class, Truck.class);

    List<T> getAll(Class<? extends T> type);

    void fill(List<? super Machine> machines, T value);

    void startWorking(List<? extends T> machines);
}

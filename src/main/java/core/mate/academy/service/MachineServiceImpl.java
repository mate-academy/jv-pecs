package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    private final List<MachineProducer> machineProducers = List.of(
            new BulldozerProducer(), new ExcavatorProducer(), new TruckProducer());
    private final List<Class> classes = List.of(
            Bulldozer.class, Excavator.class, Truck.class);

    @Override
    public List<T> getAll(Class<? extends Machine> type) {
        List<? extends Machine> machines = new ArrayList<>();
        for (int i = 0; i < classes.size(); i++) {
            if (classes.get(i) == type) {
                machines = machineProducers.get(i).get();
            }
        }
        return (List<T>) new ArrayList<>(machines);
    }

    @Override
    public void fill(List<? super Machine> machines, T value) {
        Collections.fill(machines, value);
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}

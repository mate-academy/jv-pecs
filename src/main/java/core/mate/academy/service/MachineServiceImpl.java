package core.mate.academy.service;

import core.mate.academy.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    private final MachineProducer<Bulldozer> bulldozerMachineProducer = new BulldozerProducer();
    private final MachineProducer<Excavator> excavatorMachineProducer = new ExcavatorProducer();
    private final MachineProducer<Truck> truckMachineProducer = new TruckProducer();

    @Override
    public List<T> getAll(Class<? extends T> type) {
        if (type == Bulldozer.class) {
            return (List<T>) new ArrayList<>(bulldozerMachineProducer.get());
        } else if (Objects.equals(type, Excavator.class)) {
            return (List<T>) new ArrayList<>(excavatorMachineProducer.get());
        } else if (Objects.equals(type, Truck.class)) {
            return (List<T>) new ArrayList<>(truckMachineProducer.get());
        } else {
            return new ArrayList<>();
        }
    }

    @Override
    public void doWork() {
    }

    @Override
    public void fill(List<? super T> machines, T value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends T> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}

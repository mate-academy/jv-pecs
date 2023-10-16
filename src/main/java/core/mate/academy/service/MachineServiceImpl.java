package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    private MachineProducer<Bulldozer> bulldozerMachineProducer;
    private MachineProducer<Truck> truckMachineProducer;
    private MachineProducer<Excavator> excavatorMachineProducer;

    public MachineServiceImpl() {
        this.truckMachineProducer = new TruckProducer();
        this.bulldozerMachineProducer = new BulldozerProducer();
        this.excavatorMachineProducer = new ExcavatorProducer();
    }

    @Override
    public List<T> getAll(Class<? extends T> type) {
        if (Objects.equals(type, Bulldozer.class)) {
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
    public void fill(List<? super T> machines, T value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends T> machines) {
        for (int i = 0; i < machines.size(); i++) {
            machines.get(i).doWork();
        }
    }
}

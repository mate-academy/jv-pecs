package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl<T extends Machine> implements MachineService<T>,
        MachineProducer<T> {
    private MachineProducer<Bulldozer<T>> bulldozerProducer;
    private MachineProducer<Truck<T>> truckProducer;
    private MachineProducer<Excavator<T>> excavatorProducer;

    public MachineServiceImpl() {
        bulldozerProducer = new Bulldozer<>();
        truckProducer = new Truck<>();
        excavatorProducer = new Excavator<>();
    }

    public MachineProducer<Bulldozer<T>> getBulldozerProducer() {
        return bulldozerProducer;
    }

    public MachineProducer<Truck<T>> getTruckProducer() {
        return truckProducer;
    }

    public MachineProducer<Excavator<T>> getExcavatorProducer() {
        return excavatorProducer;
    }

    @Override
    public List<T> get() {
        return null;
    }

    @Override
    public List<T> getAll(Class<? extends Machine> type) {
        List<? extends Machine> machines = new ArrayList<>();
        if (type.equals(Bulldozer.class)) {
            machines = bulldozerProducer.get();
        }
        if (type.equals(Truck.class)) {
            machines = truckProducer.get();
        }
        if (type.equals(Excavator.class)) {
            machines = excavatorProducer.get();
        }
        return (List<T>) machines;
    }

    @Override
    public void fill(List<? super Machine> machines, T value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {

    }
}

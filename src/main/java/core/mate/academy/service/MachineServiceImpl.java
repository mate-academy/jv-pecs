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
public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    private MachineProducer<Bulldozer> bulldozerProducer;
    private MachineProducer<Truck> truckProducer;
    private MachineProducer<Excavator> excavatorProducer;

    public MachineServiceImpl() {
        bulldozerProducer = new BulldozerProducer();
        truckProducer = new TruckProducer();
        excavatorProducer = new ExcavatorProducer();
    }

    public MachineProducer<Bulldozer> getBulldozerProducer() {
        return bulldozerProducer;
    }

    public MachineProducer<Truck> getTruckProducer() {
        return truckProducer;
    }

    public MachineProducer<Excavator> getExcavatorProducer() {
        return excavatorProducer;
    }

    @Override
    public List<T> getAll(Class<? extends T> type) {
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

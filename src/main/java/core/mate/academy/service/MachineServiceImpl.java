package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    private final MachineProducer<Bulldozer> bulldozerProducer;
    private final MachineProducer<Truck> truckProducer;
    private final MachineProducer<Excavator> excavatorProducer;

    public MachineServiceImpl(MachineProducer<Bulldozer> bulldozerProducer,
                              MachineProducer<Truck> truckProducer,
                              MachineProducer<Excavator> excavatorProducer) {
        this.bulldozerProducer = bulldozerProducer;
        this.truckProducer = truckProducer;
        this.excavatorProducer = excavatorProducer;
    }

    public MachineServiceImpl() {
        this(new BulldozerProducer(), new TruckProducer(), new ExcavatorProducer());
    }

    @Override
    public List<T> getAll(Class<? extends T> type) {
        if (type == null) {
            throw new IllegalArgumentException("type must not be null");
        }

        List<T> produced = new ArrayList<>();

        if (type == Bulldozer.class) {
            produced.addAll((Collection<? extends T>) bulldozerProducer.get());
        } else if (type == Truck.class) {
            produced.addAll((Collection<? extends T>) truckProducer.get());
        } else if (type == Excavator.class) {
            produced.addAll((Collection<? extends T>) excavatorProducer.get());
        } else {
            return Collections.emptyList();
        }

        return new ArrayList<>(produced);
    }

    @Override
    public void fill(List<? super T> machines, T value) {
        if (machines == null || value == null) {
            throw new IllegalArgumentException("machines values must be not null");
        }

        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends T> machines) {
        if (machines == null) {
            throw new IllegalArgumentException("machines must not be null");
        }

        for (T m : machines) {
            if (m != null) {
                m.doWork();
            }
        }
    }
}

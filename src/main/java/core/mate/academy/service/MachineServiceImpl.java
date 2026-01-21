package core.mate.academy.service;

import core.mate.academy.model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * Your implementation of MachineService.
 * */
public class MachineServiceImpl<M extends Machine> implements MachineService<M> {

    private MachineProducer<Bulldozer> bulldozerProducer;
    private MachineProducer<Excavator> excavatorProducer;
    private MachineProducer<Truck> truckProducer;

    public MachineServiceImpl() {
        this.bulldozerProducer = new BulldozerProducer();
        this.excavatorProducer = new ExcavatorProducer();
        this.truckProducer = new TruckProducer();
    }

    public MachineServiceImpl(MachineProducer<Bulldozer> bulldozerProducer,
                              MachineProducer<Excavator> excavatorProducer,
                              MachineProducer<Truck> truckProducer) {
        this.bulldozerProducer = bulldozerProducer;
        this.excavatorProducer = excavatorProducer;
        this.truckProducer = truckProducer;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<M> getAll(Class<? extends Machine> type) {
        List<? extends Machine> machines;

        if (type == Bulldozer.class) {
            machines = bulldozerProducer.get();
        } else if (type == Excavator.class) {
            machines = excavatorProducer.get();
        } else if (type == Truck.class) {
            machines = truckProducer.get();
        } else {
            return Collections.emptyList();
        }

        return (List<M>) new ArrayList<>(machines);
    }

    @Override
    public void fill(List<? super M> machines, M value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine m : machines) {
            m.doWork();
        }
    }
}

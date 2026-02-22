package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;

import java.util.Collections;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl <M extends Machine> implements MachineService<M> {
    @Override
    public List<M> getAll(Class<? extends M> type) {

        if (type == Bulldozer.class) {
            return (List<M>) new BulldozerProducer().get();
        }

        if (type == Excavator.class) {
            return (List<M>) new ExcavatorProducer().get();
        }

        if (type == Truck.class) {
            return (List<M>) new TruckProducer().get();
        }

        return Collections.emptyList();
    }

    @Override
    public void fill(List<? super M> machines, M value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends M> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    };
}



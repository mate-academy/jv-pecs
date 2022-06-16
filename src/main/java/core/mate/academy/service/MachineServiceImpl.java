package core.mate.academy.service;

import core.mate.academy.model.Machine;

import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    @Override
    public List<T> getAll(Class<? extends Machine> type) {
        MachineProducer<? extends Machine> someProducer;
        if (BulldozerProducer.class.equals(type)) {
            someProducer = new BulldozerProducer();
        } else if (ExcavatorProducer.class.equals(type)) {
            someProducer = new ExcavatorProducer();
        } else {
            someProducer = new TruckProducer();
        }
        List<? extends Machine> machines = someProducer.get();
        return new ArrayList(machines);
    }

    @Override
    public void fill(List<? super Machine> machines, T value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine: machines) {
            machine.doWork();
        }
    }
}

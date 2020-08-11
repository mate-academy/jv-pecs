package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Track;
import java.util.ArrayList;
import java.util.List;

/**
 * My implementation of MachineService.
 */
public class MachineServiceImpl<T extends Machine> implements MachineService<T> {

    @Override
    public List<Machine> getAll(Class<? extends T> type) {
        MachineProducer<? extends Machine> machineProducer;
        if (type == Bulldozer.class) {
            machineProducer = new BulldozerProducer();
        } else if (type == Excavator.class) {
            machineProducer = new ExcavatorProducer();
        } else if (type == Track.class) {
            machineProducer = new TrackProducer();
        } else {
            throw new IllegalArgumentException("Type not supported: " + type);
        }
        return new ArrayList<>(machineProducer.get());
    }

    @Override
    public void fill(List<? super T> machines, T value) {
        int size = machines.size();
        for (int i = 0; i < size; i++) {
            machines.add(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends T> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}

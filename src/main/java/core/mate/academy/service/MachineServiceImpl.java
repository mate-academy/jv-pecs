package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Track;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    @Override
    public List<Machine> getAll(Class<? extends T> type) {
        List<? extends Machine> machines = null;
        if (type.equals(Bulldozer.class)) {
            machines = new BulldozerProducer().get();
            return (List<Machine>) machines;
        }
        if (type.equals(Excavator.class)) {
            machines = new ExcavatorProducer().get();
            return (List<Machine>) machines;
        }
        if (type.equals(Track.class)) {
            machines = new TrackProducer().get();
            return (List<Machine>) machines;
        }
        return (List<Machine>) machines;
    }

    @Override
    public void fill(List<? super T> machines, T value) {
        for (int i = 0, n = machines.size(); i < n; i++) {
            machines.add(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends T> machines) {
        for (T machine : machines) {
            machine.doWork();
        }
    }
}

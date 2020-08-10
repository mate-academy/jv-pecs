package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Track;
import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    @Override
    public List<Machine> getAll(Class type) {
        List<? extends Machine> machines = new ArrayList<>();
        if (type == Bulldozer.class) {
            machines = new BulldozerProducer().get();
            return (List<Machine>) machines;
        } else if (type == Excavator.class) {
            machines = new ExcavatorProducer().get();
            return (List<Machine>) machines;
        } else if (type == Track.class) {
            machines = new TrackProducer().get();
            return (List<Machine>) machines;
        }
        return null;
    }

    @Override
    public void fill(List<? super Machine> machines, T value) {
        int size = machines.size();
        for (int i = 0; i < size; i++) {
            machines.add(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}

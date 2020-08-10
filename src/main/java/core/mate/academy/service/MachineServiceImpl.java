package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Track;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService {
    @Override
    public List<Machine> getAll(Class type) {
        List<? extends Machine> machines = null;
        if (type.equals(Bulldozer.class)) {
            BulldozerProducer bulldozerProducer = new BulldozerProducer();
            machines = bulldozerProducer.get();
            return (List<Machine>) machines;
        }
        if (type.equals(Excavator.class)) {
            ExcavatorProducer excavatorProducer = new ExcavatorProducer();
            machines = excavatorProducer.get();
            return (List<Machine>) machines;
        }
        if (type.equals(Track.class)) {
            TrackProducer trackProducer = new TrackProducer();
            machines = trackProducer.get();
            return (List<Machine>) machines;
        }
        return (List<Machine>) machines;
    }

    @Override
    public void fill(List machines, Machine value) {
        for (int i = 0, n = machines.size(); i < n; i++) {
            machines.add(i, value);
        }
    }

    @Override
    public void startWorking(List machines) {
        for (Object machine : machines) {
            ((Machine) machine).doWork();
        }
    }
}

package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Track;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class type) {
        List<? extends Machine> wehicles = null;
        if (type.equals(Bulldozer.class)) {
            wehicles = new BulldozerFactory().get();
        }
        if (type.equals(Excavator.class)) {
            wehicles = new ExcavatorFactory().get();
        }
        if (type.equals(Track.class)) {
            wehicles = new TrackFactory().get();
        }
        return (List<Machine>) wehicles;
    }

    @Override
    public void fill(List machines, Machine value) {
        for (int i = 0, n = machines.size(); i < n; i++) {
            machines.add(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine:machines) {
            machine.doWork();
        }
    }
}

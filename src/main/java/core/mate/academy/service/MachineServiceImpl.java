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
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type == Bulldozer.class) {
            return new BuldozerProducer().get();
        }
        if (type == Excavator.class) {
            return new ExcavatorProducer().get();
        }
        if (type == Track.class) {
            return new TrackProducer().get();
        }
        return null;
    }

    @Override
    public void fill(List<? super Machine> machines, T value) {
        int howMuchToAdd = machines.size();
        for (int i = 0; i < howMuchToAdd; i++) {
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

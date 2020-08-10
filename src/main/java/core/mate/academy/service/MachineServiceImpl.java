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
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type == Bulldozer.class) {
            return (List<Machine>) new Bulldozer().get();
        }

        if (type == Track.class) {
            return (List<Machine>) new Track().get();
        }

        if (type == Excavator.class) {
            return (List<Machine>) new Excavator().get();
        }
        return null;
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        int size = (machines.size() * 3) / 2 - 1;
        for (int i = 0; i < size; i++) {
            machines.add(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        Machine track = new Track();
        track.doWork();
        Machine bulldozer = new Bulldozer();
        bulldozer.doWork();
        Machine excavator = new Excavator();
        excavator.doWork();
    }
}

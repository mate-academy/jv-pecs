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
public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type == Bulldozer.class) {
            Machine bulldozer1 = new Bulldozer();
            Machine bulldozer2 = new Bulldozer();

            List<Machine> bulldozers = new ArrayList<>();
            bulldozers.add(bulldozer1);
            bulldozers.add(bulldozer2);
            return bulldozers;
        }

        if (type == Track.class) {
            Machine track1 = new Track();
            Machine track2 = new Track();

            List<Machine> tracks = new ArrayList<>();
            tracks.add(track1);
            tracks.add(track2);
            return tracks;
        }

        if (type == Excavator.class) {
            Machine excavator1 = new Excavator();
            Machine excavator2 = new Excavator();

            List<Machine> excavators = new ArrayList<>();
            excavators.add(excavator1);
            excavators.add(excavator2);
            return excavators;
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

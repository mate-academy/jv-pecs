package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Track;

import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type.equals(Excavator.class)) {
            List<Excavator> excavatorList = new ExcavatorProducer().get();
            return new ArrayList<>(excavatorList);
        }
        if (type.equals(Bulldozer.class)) {
            List<Bulldozer> bulldozerList = new BulldozerProducer().get();
            return new ArrayList<>(bulldozerList);
        }
        if (type.equals(Track.class)) {
            List<Track> trackList = new TrackProducer().get();
            return new ArrayList<>(trackList);
        }
        return null;
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        int size = machines.size();
        for (int i = 0; i < size; i++) {
            machines.add(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> list) {
        for (Machine machine : list) {
            machine.doWork();
        }
    }
}

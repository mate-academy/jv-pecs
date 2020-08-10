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
        List<Machine> machines = new ArrayList<>();
        if (type.equals(Bulldozer.class)) {
            List<Bulldozer> bulldozers = new BulldozerProducer().get();
            for (int i = 0; i < bulldozers.size(); i++) {
                machines.add(bulldozers.get(i));
            }
        }
        if (type.equals(Track.class)) {
            List<Track> tracks = new TrackProducer().get();
            for (int i = 0; i < tracks.size(); i++) {
                machines.add(tracks.get(i));
            }
        }
        if (type.equals(Excavator.class)) {
            List<Excavator> excavators = new ExcavatorProducer().get();
            for (int i = 0; i < excavators.size(); i++) {
                machines.add(excavators.get(i));
            }
        }
        return machines;
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        int size = machines.size();
        for (int i = 0; i < size; i++) {
            machines.add(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (int i = 0; i < machines.size(); i++) {
            machines.get(i).doWork();
        }
    }
}

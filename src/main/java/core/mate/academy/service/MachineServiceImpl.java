package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.BulldozerProducer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.ExcavatorProducer;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Track;
import core.mate.academy.model.TrackProducer;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<Machine> machines = new ArrayList<>();
        if (type.equals(Track.class)) {
            List<Track> tracks = new TrackProducer().get();
            machines.addAll(tracks);
        } else if (type.equals(Bulldozer.class)) {
            List<Bulldozer> bulldozers = new BulldozerProducer().get();
            machines.addAll(bulldozers);
        } else {
            List<Excavator> excavators = new ExcavatorProducer().get();
            machines.addAll(excavators);
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
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}

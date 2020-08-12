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
        if (type == Track.class) {
            List<Track> track = new TrackProducer().get();
            return new ArrayList<>(track);
        } else if (type == Excavator.class) {
            List<Excavator> excavators = new ExcavatorProducer().get();
            return new ArrayList<>(excavators);
        } else if (type == Bulldozer.class) {
            List<Bulldozer> bulldozer = new BulldozerProducer().get();
            return new ArrayList<>(bulldozer);
        } else {
            throw new IllegalArgumentException("Type is not correct");
        }
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

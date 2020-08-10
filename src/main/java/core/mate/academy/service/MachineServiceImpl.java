package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Track;
import core.mate.academy.producer.BulldozerProducer;
import core.mate.academy.producer.ExcavatorProducer;
import core.mate.academy.producer.TrackProducer;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService {

    @Override
    public List<? extends Machine> getAll(Class type) {
        if (type == Bulldozer.class) {
            BulldozerProducer bulldozer = new BulldozerProducer();
            return bulldozer.get();
        }
        if (type == Excavator.class) {
            ExcavatorProducer excavator = new ExcavatorProducer();
            return excavator.get();
        }
        if (type == Track.class) {
            TrackProducer track = new TrackProducer();
            return track.get();
        }
        return null;
    }

    @Override
    public void startWorking(List list) {

    }

    @Override
    public void fill(List machines, Machine value) {
        int size = machines.size();
        for (int i = 0; i < size; i++) {
            machines.add(i, value);
        }

    }
}

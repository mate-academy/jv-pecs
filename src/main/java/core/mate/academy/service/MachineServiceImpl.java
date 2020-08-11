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
        List<? extends Machine> list = new ArrayList<>();
        if (Bulldozer.class.equals(type)) {
            list = new BulldozerProducer().get();
        }
        if (Excavator.class.equals(type)) {
            list = new ExcavatorProducer().get();
        }
        if (Track.class.equals(type)) {
            list = new TrackProducer().get();
        }
        return new ArrayList<>(list);
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        int originalSize = machines.size();
        for (int i = 0; i < originalSize; i++) {
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

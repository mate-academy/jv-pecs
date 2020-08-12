package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Track;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (Bulldozer.class.equals(type)) {
            return new ArrayList<>(new BulldozerProducer().get());
        }
        if (Excavator.class.equals(type)) {
            return new ArrayList<>(new ExcavatorProducer().get());
        }
        if (Track.class.equals(type)) {
            return new ArrayList<>(new TrackProducer().get());
        }
        throw new NoSuchElementException("Sorry, looks like "
                + type + " is not a Machine");
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

package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.BulldozerProducer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.ExcavatorProducer;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Track;
import core.mate.academy.model.TrackProducer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (Bulldozer.class.equals(type)) {
            BulldozerProducer bulldozerProducer = new BulldozerProducer();
            return new ArrayList<>(bulldozerProducer.get());
        }
        if (Excavator.class.equals(type)) {
            ExcavatorProducer excavatorProducer = new ExcavatorProducer();
            return new ArrayList<>(excavatorProducer.get());
        }
        if (Track.class.equals(type)) {
            TrackProducer trackProducer = new TrackProducer();
            return new ArrayList<>(trackProducer.get());
        }
        return null;
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        Collections.fill(machines, value);
        for (int i = machines.size(); i > 0; i--) {
            machines.add(value);
        }
    }
}

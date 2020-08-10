package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Track;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type == Bulldozer.class) {
            List<Bulldozer> bulldozerList = new BulldozerMachineProducerImpl().get();
            return new ArrayList<>(bulldozerList);
        }

        if (type == Track.class) {
            List<Track> trackList = new TrackMachineProducerImpl().get();
            return new ArrayList<>(trackList);
        }

        if (type == Excavator.class) {
            List<Excavator> excavatorList = new ExcavatorMachineProducerImpl().get();
            return new ArrayList<>(excavatorList);
        }
        return null;
    }

    @Override
    public void fill(List<? super Machine> list, Machine value) {
        Collections.fill(list, value);
        for (int i = list.size(); i > 0; i--) {
            list.add(value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> list) {
        for (Machine vehicle : list) {
            vehicle.doWork();
        }
    }
}

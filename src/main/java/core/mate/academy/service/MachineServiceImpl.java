package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Track;
import java.util.LinkedList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<Machine> list = new LinkedList<>();
        if (type == Bulldozer.class) {
            list.addAll(new BulldozerProducer().get());
        }
        if (type == Excavator.class) {
            list.addAll(new ExcavatorProducer().get());
        }
        if (type == Track.class) {
            list.addAll(new TrackProducer().get());
        }
        return list;
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        int length = machines.size();
        for (int i = 0; i < length; i++) {
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

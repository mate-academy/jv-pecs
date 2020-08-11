package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Track;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<? extends Machine> machines = null;
        if (type.equals(Bulldozer.class)) {
            machines = new BulldozerProducer().get();
        }
        else {
            if (type.equals(Excavator.class)) {
                machines = new ExcavatorProducer().get();
            }
            else {
                if (type.equals(Track.class)) {
                    machines = new TrackProducer().get();
                }
            }
        }
        return (List<Machine>) machines;
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0, n = machines.size(); i < n; i++) {
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

package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.ProducerBulldozer;
import core.mate.academy.model.ProducerExcavator;
import core.mate.academy.model.ProducerTruck;
import core.mate.academy.model.Track;
import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type == Bulldozer.class) {
            return new ArrayList<>(new ProducerBulldozer().get());
        }
        if (type == Excavator.class) {
            return new ArrayList<>(new ProducerExcavator().get());
        }
        if (type == Track.class) {
            return new ArrayList<>(new ProducerTruck().get());
        }
        throw new RuntimeException("Inappropriate class type");
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = machines.size() - 1; i >= 0; i--) {
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

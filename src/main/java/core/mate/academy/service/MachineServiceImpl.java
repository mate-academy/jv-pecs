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
    public void fill(List<? super Machine> machines, Machine value) {
        int count = machines.size();
        for (int i = 0; i < count; i++) {
            machines.add(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        String className = type.getSimpleName();
        switch (className) {
            case "Bulldozer":
                List<Bulldozer> bulldozers = new BulldozerProducer().get();
                return new ArrayList<>(bulldozers);
            case "Track":
                List<Track> tracks = new TruckProducer().get();
                return new ArrayList<>(tracks);
            case "Excavator":
                List<Excavator> excavators = new ExcavatorProducer().get();
                return new ArrayList<>(excavators);
            default:
                return null;
        }
    }
}

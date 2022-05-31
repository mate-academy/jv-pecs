
package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.model.Workable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    private Map<Class<? extends Machine>, List> allImpl;

    public MachineServiceImpl() {
        allImpl = new HashMap<>();
        allImpl.put(Truck.class, new TrackProducer().get());
        allImpl.put(Excavator.class, new ExcavatorProducer().get());
        allImpl.put(Bulldozer.class, new BulldozerProducer().get());
        allImpl.put(Machine.class, new ArrayList<>());
    }

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        return allImpl.get(type);
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        machines.forEach(Workable::doWork);
    }
}

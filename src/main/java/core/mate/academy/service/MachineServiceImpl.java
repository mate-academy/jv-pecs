
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
public class MachineServiceImpl<T> implements MachineService<Machine> {
    private Map<Class<? extends Machine>, List<Machine>> allImpl;

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        loadingAllImplementations();
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

    private void loadingAllImplementations() {
        allImpl = new HashMap<>();
        allImpl.put(Truck.class, new TrackProducerImpl().get());
        allImpl.put(Excavator.class, new ExcavatorProducerImpl().get());
        allImpl.put(Bulldozer.class, new BulldozerProducerImpl().get());
        allImpl.put(Machine.class, new ArrayList<>());
    }
}

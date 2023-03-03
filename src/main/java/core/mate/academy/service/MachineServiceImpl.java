package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        Map<String, MachineProducer<? extends Machine>> producers = Map.of(
                "Bulldozer", new BulldozerProducer(),
                "Excavator", new ExcavatorProducer(),
                "Truck", new TruckProducer());
        String typeKey = type.getSimpleName();
        if (producers.containsKey(typeKey)) {
            return (List<Machine>) producers.get(typeKey).get();
        }
        return Collections.emptyList();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        Collections.fill(machines, value);
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}

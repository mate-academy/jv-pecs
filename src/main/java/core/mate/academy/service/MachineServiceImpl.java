package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        Map<String, MachineProducer<? extends Machine>> producers = new HashMap<>();
        producers.put("Bulldozer", new BulldozerProducer());
        producers.put("Excavator", new ExcavatorProducer());
        producers.put("Truck", new TruckProducer());
        String typeKey = type.getSimpleName();
        if (producers.containsKey(typeKey)) {
            return new ArrayList<>(producers.get(typeKey).get());
        }
        return new ArrayList<>();
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

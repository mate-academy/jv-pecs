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
        Map<String, MachineProducer<? extends Machine>> allMachines = new HashMap<>();
        allMachines.put("Truck", new TruckProducer());
        allMachines.put("Excavator", new ExcavatorProducer());
        allMachines.put("Bulldozer", new BulldozerProducer());
        List<? extends Machine> machines = null;
        for (String key : allMachines.keySet()) {
            if (key.equals(type.getSimpleName())) {
                machines = allMachines.get(key).get();
            }
        }
        return machines != null ? (List<Machine>) machines : new ArrayList<>();
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

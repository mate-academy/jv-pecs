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
    private Map<Class<? extends Machine>,
            MachineProducer<? extends Machine>> machineTypesMap = init();

    private Map<Class<? extends Machine>, MachineProducer<? extends Machine>> init() {
        Map<Class<? extends Machine>, MachineProducer<? extends Machine>> result = new HashMap<>();
        for (MachineTypes machine : MachineTypes.values()) {
            result.put(machine.getMachineClass(), machine.getMachineProducer());
        }
        return result;
    }

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (machineTypesMap.containsKey(type)) {
            return new ArrayList<>(machineTypesMap.get(type).get());
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

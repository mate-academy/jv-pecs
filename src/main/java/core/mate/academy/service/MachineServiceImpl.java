package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
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
        Map<Class<? extends Machine>, List<Machine>> mapMachines = new HashMap<>();
        mapMachines.put(Bulldozer.class, new BulldozerProducer().get());
        mapMachines.put(Excavator.class, new ExcavatorProducer().get());
        mapMachines.put(Truck.class, new TruckProducer().get());
        return (mapMachines.get(type) != null) ? mapMachines.get(type) : Collections.emptyList();
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        int size = machines.size();
        for (int i = 0; i < size; i++) {
            machines.set(i, value);
        }
    }
}

package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    private MachineProducer<Truck> truckMachineProducer = new TruckProducer();
    private MachineProducer<Excavator> excavatorMachineProducer = new ExcavatorProducer();
    private MachineProducer<Bulldozer> bulldozerMachineProducer = new BulldozerProducer();

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        Map<String, MachineProducer<? extends Machine>> allMachines = new HashMap<>();
        allMachines.put("Truck", truckMachineProducer);
        allMachines.put("Excavator", excavatorMachineProducer);
        allMachines.put("Bulldozer", bulldozerMachineProducer);
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

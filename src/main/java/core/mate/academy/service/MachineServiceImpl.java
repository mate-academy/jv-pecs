package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    private final ExcavatorProducer excavatorProducer;
    private final BulldozerProducer bulldozerProducer;
    private final TruckProducer truckProducer;

    public MachineServiceImpl() {
        excavatorProducer = new ExcavatorProducer();
        bulldozerProducer = new BulldozerProducer();
        truckProducer = new TruckProducer();
    }

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<? extends Machine> listMachines;
        if (type.equals(Excavator.class)) {
            listMachines = excavatorProducer.get();
            return new ArrayList<>(listMachines);
        } else if (type.equals(Bulldozer.class)) {
            listMachines = bulldozerProducer.get();
            return new ArrayList<>(listMachines);
        } else if (type.equals(Truck.class)) {
            listMachines = truckProducer.get();
            return new ArrayList<>(listMachines);
        }
        return Collections.emptyList();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        Collections.fill(machines, value);
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        machines.forEach(machine -> machine.doWork());
    }
}

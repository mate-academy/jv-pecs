package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    private final BulldozerProducer bulldozerProducer = new BulldozerProducer();
    private final TruckProducer truckProducer = new TruckProducer();
    private final ExcavatorProducer excavatorProducer = new ExcavatorProducer();

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<Machine> machineList;
        if (type == Bulldozer.class) {
            machineList = new ArrayList<>(bulldozerProducer.get());
            return machineList;
        } else if (type == Excavator.class) {
            machineList = new ArrayList<>(excavatorProducer.get());
            return machineList;
        } else if (type == Truck.class) {
            machineList = new ArrayList<>(truckProducer.get());
            return machineList;
        }
        return new ArrayList<>();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine: machines) {
            machine.doWork();
        }
    }
}

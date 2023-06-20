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

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type != null) {
            if (type == Bulldozer.class) {
                MachineProducer<Bulldozer> bulldozerMachineProducer = new BulldozerProducer();
                return new ArrayList<>(bulldozerMachineProducer.get());
            }
            if (type == Excavator.class) {
                MachineProducer<Excavator> excavatorMachineProducer = new ExcavatorProducer();
                return new ArrayList<>(excavatorMachineProducer.get());
            }
            if (type == Truck.class) {
                MachineProducer<Truck> truckMachineProducer = new TruckProducer();
                return new ArrayList<>(truckMachineProducer.get());
            }
        }
        return new ArrayList<>();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        if (machines != null) {
            for (int i = 0; i < machines.size(); i++) {
                machines.set(i, value);
            }
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}

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

    private final MachineProducer<Bulldozer> bulldozerMachineProducer = new BulldozerProducer();
    private final MachineProducer<Truck> truckMachineProducer = new TruckProducer();
    private final MachineProducer<Excavator> excavatorMachineProducer = new ExcavatorProducer();

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type.equals(Bulldozer.class)) {
            return new ArrayList<>(bulldozerMachineProducer.get());
        } else if (type.equals(Truck.class)) {
            return new ArrayList<>(truckMachineProducer.get());
        } else if (type.equals(Excavator.class)) {
            return new ArrayList<>(excavatorMachineProducer.get());
        } else {
            return new ArrayList<>();
        }
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (int i = 0; i < machines.size(); i++) {
            machines.get(i).doWork();
        }
    }
}

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
    private final BulldozerProducer bulldozerProducer = new BulldozerProducer();
    private final TruckProducer truckProducer = new TruckProducer();
    private final ExcavatorProducer excavatorProducer = new ExcavatorProducer();

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<Machine> machineList;
        if (Bulldozer.class.equals(type)) {
            MachineProducer<Bulldozer> bulldozerProducer = new BulldozerProducer();
            return new ArrayList<>(bulldozerProducer.get());
        } else if (Excavator.class.equals(type)) {
            MachineProducer<Excavator> excavatorProducer = new ExcavatorProducer();
            return new ArrayList<>(excavatorProducer.get());
        } else if (Truck.class.equals(type)) {
            MachineProducer<Truck> truckProducer = new TruckProducer();
            return new ArrayList<>(truckProducer.get());
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

package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    private final MachineProducer<Truck> truckMachineProducer = new TruckProducer();
    private final MachineProducer<Excavator> excavatorMachineProducer = new ExcavatorProducer();
    private final MachineProducer<Bulldozer> bulldozerMachineProducer = new BulldozerProducer();

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type == Truck.class) {
            return new ArrayList<>(truckMachineProducer.get());
        } else if (type == Excavator.class) {
            return new ArrayList<>(excavatorMachineProducer.get());
        } else if (type == Bulldozer.class) {
            return new ArrayList<>(bulldozerMachineProducer.get());
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

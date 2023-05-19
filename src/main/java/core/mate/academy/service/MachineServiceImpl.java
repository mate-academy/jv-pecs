package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    private final MachineProducer<Bulldozer> bulldozerMachineProducer = new BulldozerProducer();
    private final MachineProducer<Truck> truckMachineProducer = new TruckProducer();
    private final MachineProducer<Excavator> excavatorMachineProducer = new ExcavatorProducer();

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<? extends Machine> trucks = truckMachineProducer.get();
        List<? extends Machine> bulldozers = bulldozerMachineProducer.get();
        List<? extends Machine> excavators = excavatorMachineProducer.get();

        if (type == Truck.class) {
            return new ArrayList<>(trucks);
        }
        if (type == Bulldozer.class) {
            return new ArrayList<>(bulldozers);
        }
        if (type == Excavator.class) {
            return new ArrayList<>(excavators);
        }
        return List.of();
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

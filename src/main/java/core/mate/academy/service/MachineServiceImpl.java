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
    private final MachineProducer<Bulldozer> bulldozerMachineProducer;
    private final MachineProducer<Truck> truckMachineProducer;
    private final MachineProducer<Excavator> excavatorMachineProducer;

    {
        this.bulldozerMachineProducer = new BulldozerProducer();
        this.excavatorMachineProducer = new ExcavatorProducer();
        this.truckMachineProducer = new TruckProducer();
    }

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<? extends Machine> machines = new ArrayList<>();
        if (type == Bulldozer.class) {
            machines = bulldozerMachineProducer.get();
        }
        if (type == Truck.class) {
            machines = truckMachineProducer.get();
        }
        if (type == Excavator.class) {
            machines = excavatorMachineProducer.get();
        }
        return new ArrayList<>(machines);
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}

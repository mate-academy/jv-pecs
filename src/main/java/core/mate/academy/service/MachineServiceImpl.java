package core.mate.academy.service;

import core.mate.academy.impl.BulldozerProducer;
import core.mate.academy.impl.ExcavatorProducer;
import core.mate.academy.impl.TruckProducer;
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

    private MachineProducer<Bulldozer> bulldozerMachineProducer = new BulldozerProducer();
    private MachineProducer<Excavator> excavatorMachineProducer = new ExcavatorProducer();
    private MachineProducer<Truck> truckMachineProducer = new TruckProducer();

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<Machine> machines = new ArrayList<>();
        if (type == Bulldozer.class) {
            machines.addAll(bulldozerMachineProducer.get());
        } else if (type == Excavator.class) {
            machines.addAll(excavatorMachineProducer.get());
        } else if (type == Truck.class) {
            machines.addAll(truckMachineProducer.get());
        }
        return machines;
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

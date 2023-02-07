package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.Collections;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    private final MachineProducer<Bulldozer> bulldozerMachineProducer = new BulldozerProducer();
    private final MachineProducer<Excavator> excavatorMachineProducer = new ExcavatorProducer();
    private final MachineProducer<Truck> truckMachineProducer = new TruckProducer();

    @Override
    public List<? extends Machine> getAll(Class type) {

        if (type == Bulldozer.class) {
            return bulldozerMachineProducer.get();
        }
        if (type == Excavator.class) {
            return excavatorMachineProducer.get();
        }
        if (type == Truck.class) {
            return truckMachineProducer.get();
        }
        return Collections.emptyList();
    }

    @Override
    public void startWorking(List<? extends Machine> list) {
        for (Machine machine : list) {
            machine.doWork();
        }
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        Collections.fill(machines, value);
    }
}

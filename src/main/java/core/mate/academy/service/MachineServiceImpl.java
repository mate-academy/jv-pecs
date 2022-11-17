package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java. util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        final MachineProducer<Bulldozer> bulldozerProducer = new BulldozerProducer();
        final MachineProducer<Excavator> excavatorProducer = new ExcavatorProducer();
        final MachineProducer<Truck> truckProducer = new TruckProducer();
        MachineProducer<? extends Machine> machineProducer;
        if (Bulldozer.class.equals(type)) {
            return new ArrayList<>(bulldozerProducer.get());
        } else if (Truck.class.equals(type)) {
            return new ArrayList<>(truckProducer.get());
        } else if (Excavator.class.equals(type)) {
            return new ArrayList<>(excavatorProducer.get());
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
        for (Machine machine: machines) {
            machine.doWork();
        }

    }
}

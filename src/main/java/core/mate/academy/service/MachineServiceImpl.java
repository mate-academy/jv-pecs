package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {

    @Override
    public List<? extends Machine> getAll(Class<? extends Machine> type) {
        if (type == Excavator.class) {
            MachineProducer<Excavator> excavatorProducer = new ExcavatorProducer();
            return excavatorProducer.get();
        }

        if (type == Bulldozer.class) {
            MachineProducer<Bulldozer> bulldozerProducer = new BulldozerProducer();
            return bulldozerProducer.get();
        }

        if (type == Truck.class) {
            MachineProducer<Truck> truckProducer = new TruckProducer();
            return truckProducer.get();
        } else {
            return List.of();
        }
    }

    @Override
    public void fill(List<Machine> machines, Machine value) {
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

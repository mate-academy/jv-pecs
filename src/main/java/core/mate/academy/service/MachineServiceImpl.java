package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (Bulldozer.class.equals(type)) {
            MachineProducer<? extends Machine> buldozerProducer = new BulldozerProducer();
            return (List<Machine>) buldozerProducer.get();
        } else if (Excavator.class.equals(type)) {
            MachineProducer<? extends Machine> excavatorProducer = new ExcavatorProducer();
            return (List<Machine>) excavatorProducer.get();
        } else if (Truck.class.equals(type)) {
            MachineProducer<? extends Machine> truckProducer = new TruckProducer();
            return (List<Machine>) truckProducer.get();
        }
        return new ArrayList<>();
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

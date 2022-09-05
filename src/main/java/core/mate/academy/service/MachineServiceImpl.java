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
        MachineProducer machineProducer;
        if (Bulldozer.class.equals(type)) {
            machineProducer = new BulldozerProducer();
        } else if (Excavator.class.equals(type)) {
            machineProducer = new ExcavatorProduction();
        } else if (Truck.class.equals(type)) {
            machineProducer = new TruckProduction();
        } else {
            return new ArrayList<>();
        }
        return machineProducer.get();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine machine) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, machine);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}

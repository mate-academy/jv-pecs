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
        MachineProducer<? extends Machine> listWithMachines;
        if (type.equals(Bulldozer.class)) {
            listWithMachines = new BulldozerProducer();
        } else if (type.equals(Excavator.class)) {
            listWithMachines = new ExcavatorProducer();
        } else if (type.equals(Truck.class)) {
            listWithMachines = new TruckProducer();
        } else {
            return new ArrayList<>();
        }
        return (List<Machine>) listWithMachines.get();
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

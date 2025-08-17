package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class type) {
        List<? extends Machine> listMachines = new ArrayList<>();
        MachineProducer machineProducer;
        if (type == Truck.class) {
            machineProducer = new TruckProducer();
            listMachines = machineProducer.get();
        } else if (type == Bulldozer.class) {
            machineProducer = new BulldozerProducer();
            listMachines = machineProducer.get();
        } else if (type == Excavator.class) {
            machineProducer = new ExcavatorProducer();
            listMachines = machineProducer.get();
        }
        return new ArrayList<>(listMachines);
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

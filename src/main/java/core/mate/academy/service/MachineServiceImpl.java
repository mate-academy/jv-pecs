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
        List<Machine> machineList = new ArrayList<>();
        if (type.equals(Bulldozer.class)) {
            MachineProducer<Bulldozer> bulldozerProducer = new BulldozerProducer();
            machineList.addAll(bulldozerProducer.get());
        } else if (type.equals(Excavator.class)) {
            MachineProducer<Excavator> excavatorProducer = new ExcavatorProducer();
            machineList.addAll(excavatorProducer.get());
        } else if (type.equals(Truck.class)) {
            MachineProducer<Truck> truckProducer = new TruckProducer();
            machineList.addAll(truckProducer.get());
        }
        return machineList;
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

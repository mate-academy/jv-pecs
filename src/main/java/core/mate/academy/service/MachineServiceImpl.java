package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.Collections;
import java.util.List;

public class MachineServiceImpl<T extends Machine> implements MachineService<Machine> {

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        MachineProducer<? extends Machine> listMachines = null;
        if (type.equals(Bulldozer.class)) {
            listMachines = new BulldozerProducer();
        } else if (type.equals(Excavator.class)) {
            listMachines = new ExcavatorProducer();
        } else if (type.equals(Truck.class)) {
            listMachines = new TruckProducer();
        }
        return listMachines != null ? (List<Machine>) listMachines.get() : Collections.emptyList();
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

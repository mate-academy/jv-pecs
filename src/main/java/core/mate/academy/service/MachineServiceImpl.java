package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.Collections;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type == Bulldozer.class) {
            MachineProducer bulldozerList = new BulldozerProducer();
            return bulldozerList.get();
        }
        if (type == Truck.class) {
            MachineProducer truckList = new TruckProducer();
            return truckList.get();
        }
        if (type == Excavator.class) {
            MachineProducer excavatorList = new ExcavatorProducer();
            return excavatorList.get();
        }
        return Collections.emptyList();
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }
}

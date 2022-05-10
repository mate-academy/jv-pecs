package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        BulldozerProducer bulldozerProducer = new BulldozerProducer();
        ExcavatorProducer excavatorProducer = new ExcavatorProducer();
        TruckProducer truckProducer = new TruckProducer();
        if (type.equals(Bulldozer.class)) {
            List<? extends Machine> bulldozers = bulldozerProducer.get();
            return new ArrayList<>(bulldozers);
        }
        if (type.equals(Excavator.class)) {
            List<? extends Machine> excavators = excavatorProducer.get();
            return new ArrayList<>(excavators);
        }
        if (type.equals(Truck.class)) {
            List<? extends Machine> trucks = truckProducer.get();
            return new ArrayList<>(trucks);
        }
        return Collections.emptyList();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i,value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}

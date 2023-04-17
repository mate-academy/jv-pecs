package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.BulldozerProducer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.ExcavatorProducer;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.model.TruckProducer;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type == Bulldozer.class) {
            MachineProducer<? extends Machine> bulldozerProducer = new BulldozerProducer();
            return (List<Machine>) bulldozerProducer.get();
        } else if (type == Excavator.class) {
            MachineProducer<? extends Machine> excavatorProducer = new ExcavatorProducer();
            return (List<Machine>) excavatorProducer.get();
        } else if (type == Truck.class) {
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
    public void startWorking(List<? extends Machine> list) {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).doWork();
        }
    }
}

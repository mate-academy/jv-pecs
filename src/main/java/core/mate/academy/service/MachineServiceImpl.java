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
        List<? extends Machine> list;
        if (type.equals(Bulldozer.class)) {
            BulldozerProducer bulldozerProducer = new BulldozerProducer();
            list = bulldozerProducer.get();
        } else if (Excavator.class.equals(type)) {
            ExcavatorProducer excavatorProducer = new ExcavatorProducer();
            list = excavatorProducer.get();
        } else if (Truck.class.equals(type)) {
            TruckProducer truckProducer = new TruckProducer();
            list = truckProducer.get();
        } else {
            return new ArrayList<>();
        }
        return new ArrayList<>(list);
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> list) {
        for (Machine machine: list) {
            machine.doWork();
        }
    }
}

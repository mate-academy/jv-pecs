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
    public List<Machine> getAll(Class type) {
        List<? extends Machine> resultList = new ArrayList<>();
        if (Truck.class == type) {
            TruckProducer truckProducer = new TruckProducer();
            resultList = truckProducer.get();
        }
        if (Bulldozer.class == type) {
            BulldozerProducer bulldozerProducer = new BulldozerProducer();
            resultList = bulldozerProducer.get();
        }
        if (Excavator.class == type) {
            ExcavatorProducer excavatorProducer = new ExcavatorProducer();
            resultList = excavatorProducer.get();
        }
        return new ArrayList<>(resultList);
    }

    @Override
    public void fill(List<? super Machine> machines, Object value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i,(Machine) value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine: machines) {
            machine.doWork();
        }
    }
}

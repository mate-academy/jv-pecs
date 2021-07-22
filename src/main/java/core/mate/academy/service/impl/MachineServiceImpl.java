package core.mate.academy.service.impl;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.service.MachineService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type == Bulldozer.class) {
            BulldozerProducer bulldozerProducer = new BulldozerProducer();
            List<? extends Machine> bulldozers = bulldozerProducer.get();
            return new ArrayList<>(bulldozers);
        }
        if (type == Excavator.class) {
            ExcavatorProducer excavatorProducer = new ExcavatorProducer();
            List<? extends Machine> excavators = excavatorProducer.get();
            return new ArrayList<>(excavators);
        }
        if (type == Truck.class) {
            TruckProducer truckProducer = new TruckProducer();
            List<? extends Machine> trucks = truckProducer.get();
            return new ArrayList<>(trucks);
        }
        return Collections.emptyList();
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        machines.forEach(Machine::doWork);
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        IntStream.range(0, machines.size())
                .forEach(index -> machines.set(index, value));
    }
}

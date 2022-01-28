package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    private final Machine bulldozer = new Bulldozer();
    private final Machine excavator = new Excavator();
    private final Machine truck = new Truck();
    private final MachineProducer<Machine> bulldozerProducer = new BulldozerProducer();
    private final MachineProducer<Machine> excavatorProducer = new ExcavatorProducer();
    private final MachineProducer<Machine> truckProducer = new TruckProducer();

    @Override
    public List<? extends Machine> getAll(Class type) {
        if (type.equals(bulldozer.getClass())) {
            return bulldozerProducer.get();
        } else if (type.equals(excavator.getClass())) {
            return excavatorProducer.get();
        } else if (type.equals(truck.getClass())) {
            return truckProducer.get();
        } else {
            return new ArrayList<>();
        }
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        int currentSize = machines.size();
        machines.clear();
        for (int i = 0; i < currentSize; i++) {
            machines.add(value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}

package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;

import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    private final MachineProducer<Bulldozer> bulldozer = new BulldozerProducer();
    private final MachineProducer<Excavator> excavator = new ExcavatorProducer();
    private final MachineProducer<Truck> truck = new TruckProducer();

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type.equals(Bulldozer.class)) {
            return new ArrayList<>(bulldozer.get());
        } else if (type.equals(Excavator.class)) {
            return new ArrayList<>(excavator.get());
        } else if (type.equals(Truck.class)) {
            return new ArrayList<>(truck.get());
        } else {
            return new ArrayList<>();
        }
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

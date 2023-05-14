package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    private final MachineProducer<Bulldozer> machineProducerBulldozer = new BulldozerProducer();
    private final MachineProducer<Excavator> machineProducerExcavator = new ExcavatorProducer();
    private final MachineProducer<Truck> machineProducerTruck = new TruckProducer();

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type.equals(Bulldozer.class)) {
            return new ArrayList<>(machineProducerBulldozer.get());
        }
        if (type.equals(Excavator.class)) {
            return new ArrayList<>(machineProducerExcavator.get());
        }
        if (type.equals(Truck.class)) {
            return new ArrayList<>(machineProducerTruck.get());
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
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}

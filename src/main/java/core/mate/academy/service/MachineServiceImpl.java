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
    private final List<? extends Machine> bulldozerProducer = new BulldozerProducer().get();
    private final List<? extends Machine> excavatorProducer = new ExcavatorProducer().get();
    private final List<? extends Machine> truckProducer = new TruckProducer().get();

    @Override
    public List<Machine> getAll(Class<? extends Machine> classObject) {
        List<? extends Machine> machines;
        if (classObject.equals(Bulldozer.class)) {
            machines = bulldozerProducer;
            return new ArrayList<>(machines);
        }
        if (classObject.equals(Excavator.class)) {
            machines = excavatorProducer;
            return new ArrayList<>(machines);
        }
        if (classObject.equals(Truck.class)) {
            machines = truckProducer;
            return new ArrayList<>(machines);
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

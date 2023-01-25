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
    public List<Machine> getAll(Class<? extends Machine> classObject) {
        List<? extends Machine> machines;
        if (classObject.equals(Bulldozer.class)) {
            machines = new BulldozerProducer().get();
            return new ArrayList<>(machines);
        }
        if (classObject.equals(Excavator.class)) {
            machines = new ExcavatorProducer().get();
            return new ArrayList<>(machines);
        }
        if (classObject.equals(Truck.class)) {
            machines = new TruckProducer().get();
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
            if (machine.equals(new Bulldozer())) {
                new Bulldozer().doWork();
            }
            if (machine.equals(new Excavator())) {
                new Excavator().doWork();
            }
            if (machine.equals(new Truck())) {
                new Truck().doWork();
            }
        }
    }
}

package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {

    @Override
    public List<Machine> getAll(Class<? extends Machine> machine) {
        if (machine.equals(Bulldozer.class)) {
            return new ArrayList<>(new BulldozerProducer().get());
        }
        if ((machine.equals(Excavator.class))) {
            return new ArrayList<>(new ExcavatorProducer().get());
        }
        if (machine.equals(Truck.class)) {
            return new ArrayList<>(new TruckProducer().get());
        }
        return new ArrayList<>();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine fuel) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, fuel);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}

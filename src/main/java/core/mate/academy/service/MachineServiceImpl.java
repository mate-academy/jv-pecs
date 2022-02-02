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
        if (Bulldozer.class.equals(type)) {
            return new ArrayList<>(new BulldozerProducer().get());
        } else if (Truck.class.equals(type)) {
            return new ArrayList<>(new TruckProducer().get());
        } else if (Excavator.class.equals(type)) {
            return new ArrayList<>(new ExcavatorProducer().get());
        }
        return new ArrayList<>();
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }

    @Override
    public void fill(List<? super Machine> machines, Machine machine) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, machine);
        }
    }
}

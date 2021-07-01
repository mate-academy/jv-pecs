package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.model.Workable;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        return type == Bulldozer.class ? new BulldozerProducer().get()
                : type == Truck.class ? new TruckProducer().get()
                : type == Excavator.class ? new ExcavatorProducer().get()
                : new ArrayList<>();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        machines.forEach(x -> machines.set(machines.indexOf(x), value));
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        machines.forEach(Workable::doWork);
    }
}

package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class MachineServiceImpl implements MachineService<Machine> {

    @Override
    public List<? extends Machine> getAll(Class type) {
        if (Truck.class.equals(type)) {
            return new TruckProducer().get();
        } else if (Excavator.class.equals(type)) {
            return new ExcavatorProducer().get();
        } else if (Bulldozer.class.equals(type)) {
            return new BulldozerProducer().get();
        }
        return new ArrayList<>();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        ListIterator<? super Machine> machinesList = machines.listIterator();
        while (machinesList.hasNext()) {
            machinesList.next();
            machinesList.set(value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}

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
        if (type == Bulldozer.class) {
            List<? extends Machine> bulldozers = new BulldozerProducer().get();
            return new ArrayList<>(bulldozers);
        } else if (type == Excavator.class) {
            List<? extends Machine> excavators = new ExcavatorProducer().get();
            return new ArrayList<>(excavators);
        } else if (type == Truck.class) {
            List<? extends Machine> trucks = new TruckProducer().get();
            return new ArrayList<>(trucks);
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
        for (Machine machinesFromList : machines) {
            machinesFromList.doWork();
        }
    }
}

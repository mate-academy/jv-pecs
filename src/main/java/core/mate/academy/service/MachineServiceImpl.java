package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List getAll(Class type) {
        List<Bulldozer> bulldozers = new BulldozerProducer().get();
        List<Excavator> excavators = new ExcavatorProducer().get();
        List<Truck> trucks = new TruckProducer().get();
        if (type.equals(Bulldozer.class)) {
            return bulldozers;
        }
        if (type.equals(Excavator.class)) {
            return excavators;
        }
        if (type.equals(Truck.class)) {
            return trucks;
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
    public void startWorking(List<? extends Machine> list) {
        for (Machine machine : list) {
            machine.doWork();
        }
    }
}

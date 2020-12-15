package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.BulldozerProducer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.ExcavatorProducer;
import core.mate.academy.model.Machine;
import core.mate.academy.model.TruckProducer;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type == Bulldozer.class) {
            List<Machine> bulldozer = new ArrayList<>(new BulldozerProducer().get());
            return bulldozer;
        } else if (type == Excavator.class) {
            List<Machine> excavator = new ArrayList<>(new ExcavatorProducer().get());
            return excavator;
        }
        if (type == null) {
            return new ArrayList<>();
        } else {
            List<Machine> trucks = new ArrayList<>(new TruckProducer().get());
            return trucks;
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


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
    public List<? extends Machine> getAll(Class machineClass) {
        if (machineClass.equals(Bulldozer.class)) {
            BulldozerProducer bulldozerProducer = new BulldozerProducer();
            return bulldozerProducer.get();
        }
        if (machineClass.equals(Excavator.class)) {
            ExcavatorProducer excavatorProducer = new ExcavatorProducer();
            return excavatorProducer.get();
        }
        if (machineClass.equals(Truck.class)) {
            TruckProducer truckProducer = new TruckProducer();
            return truckProducer.get();
        }
        List<? extends Machine> emptyList = new ArrayList<>();
        return emptyList;
    }

    @Override
    public void startWorking(List list) {
        for (int i = 0; i < list.size(); i++) {
            Machine machine = (Machine) list.get(i);
            machine.doWork();
        }
    }

    @Override
    public void fill(List machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }
}

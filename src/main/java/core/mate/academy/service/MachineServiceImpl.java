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
            MachineProducer<Bulldozer> bulldozerProducer = new BulldozerProducer();
            List<? extends Machine> bulldozerList = bulldozerProducer.get();
            return new ArrayList<>(bulldozerList);
        } else if (Excavator.class.equals(type)) {
            MachineProducer<Excavator> excavatorProducer = new ExcavatorProducer();
            List<? extends Machine> excavatorList = excavatorProducer.get();
            return new ArrayList<>(excavatorList);
        } else if (Truck.class.equals(type)) {
            MachineProducer<Truck> truckProducer = new TruckProducer();
            List<? extends Machine> truckList = truckProducer.get();
            return new ArrayList<>(truckList);
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

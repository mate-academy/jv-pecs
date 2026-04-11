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
        if (type == Truck.class) {
            List<Truck> trucks = new MachineProducer.TruckProducer().get();
            return new ArrayList<>(trucks);
        } else if (type == Bulldozer.class) {
            List<Bulldozer> bulldozers = new MachineProducer.BulldozerProducer().get();
            return new ArrayList<>(bulldozers);
        } else if (type == Excavator.class) {
            List<Excavator> excavators = new MachineProducer.ExcavatorProducer().get();
            return new ArrayList<>(excavators);
        }
        return new ArrayList<>();
    }

    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}

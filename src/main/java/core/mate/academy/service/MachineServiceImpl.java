package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<Machine> machines = new ArrayList<>();
        if (type == Bulldozer.class) {
            List<Bulldozer> bulldozers = new BulldozerProducer().get();
            machines.addAll(bulldozers);
            return machines;
        }
        if (type == Excavator.class) {
            List<Excavator> excavators = new ExcavatorProducer().get();
            machines.addAll(excavators);
            return machines;
        }
        if (type == Truck.class) {
            List<Truck> trucks = new TruckProducer().get();
            machines.addAll(trucks);
            return machines;
        }
        return List.of();
    }

    @Override
    public void startWorking(List<? extends Machine> list) {
        for (Machine machine : list) {
            machine.doWork();
        }
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }
}

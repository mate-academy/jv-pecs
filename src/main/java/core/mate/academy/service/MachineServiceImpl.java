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
    public List<Machine> getAll(Class type) {
        if (type.equals(Truck.class)) {
            List<Truck> machines = new TruckProducer().get();
            return new ArrayList<Machine>(machines);
        }

        if (type.equals(Bulldozer.class)) {
            List<Bulldozer> machines = new BulldozerProducer().get();
            return new ArrayList<Machine>(machines);
        }

        if (type.equals(Excavator.class)) {
            List<Excavator> machines = new ExcavatorProducer().get();
            return new ArrayList<Machine>(machines);
        }
        return new ArrayList<Machine>();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            if (value.getClass().equals(Truck.class)) {
                machines.set(i, new Truck());
                continue;
            }

            if (value.getClass().equals(Bulldozer.class)) {
                machines.set(i, new Bulldozer());
                continue;
            }

            if (value.getClass().equals(Excavator.class)) {
                machines.set(i, new Excavator());
                continue;
            }

            machines.set(i, null);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (int i = 0; i < machines.size(); i++) {
            machines.get(i).doWork();
        }
    }
}

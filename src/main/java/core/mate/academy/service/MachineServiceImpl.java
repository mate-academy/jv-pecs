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
public class MachineServiceImpl implements MachineService {
    @Override
    public List<Object> getAll(Class type) {
        List<? extends Machine> machines = null;
        if (type.equals(Bulldozer.class)) {
            machines = new BulldozerProducer().get();
        } else if (type.equals(Excavator.class)) {
            machines = new ExcavatorProducer().get();
        } else if (type.equals(Truck.class)) {
            machines = new TruckProducer().get();
        }
        return machines == null ? new ArrayList<>() : new ArrayList<>(machines);
    }

    @Override
    public void startWorking(List machines) {

    }

    @Override
    public void fill(List machines, Object value) {
        if (value.getClass().equals(Bulldozer.class)) {
            for (int i = 0; i < machines.size(); i++) {
                machines.set(i, new Bulldozer());
            }
        } else if (value.getClass().equals(Excavator.class)) {
            for (int i = 0; i < machines.size(); i++) {
                machines.set(i, new Excavator());
            }
        } else if (value.getClass().equals(Truck.class)) {
            for (int i = 0; i < machines.size(); i++) {
                machines.set(i, new Truck());
            }
        }

    }
}

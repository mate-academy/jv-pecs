package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {

    @Override
    public List getAll(Class type) {
        if (type.equals(Bulldozer.class)) {
            BulldozerProducer bulldozerProducer = new BulldozerProducer();
            return bulldozerProducer.get();
        }
        if (type.equals(Excavator.class)) {
            ExcavatorProducer excavatorProducer = new ExcavatorProducer();
            return excavatorProducer.get();
        }
        if (type.equals(Truck.class)) {
            TruckProducer truckProducer = new TruckProducer();
            return truckProducer.get();
        } else {
            return List.of();
        }
    }

    @Override
    public void startWorking(List list) {
        for (int i = 0; i < list.size(); i++) {
            Machine machine = (Machine) list.get(i);
            machine.doWork();
        }
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        int size = machines.size();
        for (int i = 0; i < size; i++) {
            machines.set(i, value);
        }
    }
}

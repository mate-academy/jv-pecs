package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.Collections;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<? extends Machine> getAll(Class type) {
        MachineProducer<Excavator> excavatorProducer = new ExcavatorProducer();
        MachineProducer<Bulldozer> bulldozerProducer = new BulldozerProducer();
        MachineProducer<Truck> truckProducer = new TruckProducer();
        if (Excavator.class.equals(type)) {
            return excavatorProducer.get();
        } else if (Bulldozer.class.equals(type)) {
            return bulldozerProducer.get();
        } else if (Truck.class.equals(type)) {
            return truckProducer.get();
        } else {
            return Collections.emptyList();
        }
    }

    @Override
    public void startWorking(List<? extends Machine> list) {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).doWork();
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

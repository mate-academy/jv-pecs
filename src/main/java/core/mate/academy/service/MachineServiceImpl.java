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
        if (type == Bulldozer.class) {
            MachineProducer<Bulldozer> producer = new BulldozerProducer();
            List<Bulldozer> bulldozerList = producer.get();
            return new ArrayList<>(bulldozerList);
        }
        if (type == Excavator.class) {
            MachineProducer<Excavator> producer = new ExcavatorProducer();
            List<Excavator> excavatorList = producer.get();
            return new ArrayList<>(excavatorList);
        }
        if (type == Truck.class) {
            MachineProducer<Truck> producer = new TruckProducer();
            List<Truck> truckList = producer.get();
            return new ArrayList<>(truckList);
        }
        return List.of();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i,value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}

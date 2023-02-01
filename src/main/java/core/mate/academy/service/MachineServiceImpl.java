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
    private MachineProducer<Bulldozer> bulldozerProducer = new BulldozerProducer();
    private MachineProducer<Truck> truckProducer = new TruckProducer();
    private MachineProducer<Excavator> excavatorProducer = new ExcavatorProducer();

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type == Bulldozer.class) {
            return new ArrayList<>(bulldozerProducer.get());
        } else if (type == Excavator.class) {
            return new ArrayList<>(excavatorProducer.get());
        } else if (type == Truck.class) {
            return new ArrayList<>(truckProducer.get());
        } else {
            return new ArrayList<>();
        }
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        int size = machines.size();
        for (int i = 0; i < size; i++) {
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

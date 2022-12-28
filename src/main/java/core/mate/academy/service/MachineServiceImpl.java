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
public class MachineServiceImpl<T extends Machine> implements MachineService<Machine> {
    private MachineProducer bulldozerProducer = new BulldozerProducer();
    private MachineProducer truckProducer = new TruckProducer();
    private MachineProducer excavatorProducer = new ExcavatorProducer();

    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type == Bulldozer.class) {
            return bulldozerProducer.get();
        } else if (type == Truck.class) {
            return truckProducer.get();
        } else if (type == Excavator.class) {
            return excavatorProducer.get();
        }
        return new ArrayList<>();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        machines.replaceAll(machine -> (T) value);
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}

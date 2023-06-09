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
public class MachineServiceImpl<T extends Machine> implements MachineService<T> {

    private final BulldozerProducer bulldozerProducer = new BulldozerProducer();
    private final ExcavatorProducer excavatorProducer = new ExcavatorProducer();
    private final TruckProducer truckProducer = new TruckProducer();

    public List<Machine> getAll(Class<? extends T> type) {
        if (type == Bulldozer.class) {
            List<? extends Machine> bulldozers = bulldozerProducer.get();
            return new ArrayList<>(bulldozers);
        }
        if (type == Excavator.class) {
            List<? extends Machine> excavators = excavatorProducer.get();
            return new ArrayList<>(excavators);
        }
        if (type == Truck.class) {
            List<? extends Machine> trucks = truckProducer.get();
            return new ArrayList<>(trucks);
        }
        return new ArrayList<>();
    }

    public void fill(List<? super T> machines, T value) {
        int size = machines.size();
        for (int i = 0; i < size; i++) {
            machines.set(i, value);
        }
    }

    public void startWorking(List<? extends T> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}

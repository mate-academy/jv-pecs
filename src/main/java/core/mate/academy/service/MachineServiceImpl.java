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
public class MachineServiceImpl<M extends Machine> implements MachineService<M> {
    private MachineProducer<Bulldozer> bulldozerProducer = new BulldozerProducer();
    private MachineProducer<Excavator> excavatorProducer = new ExcavatorProducer();
    private MachineProducer<Truck> truckProducer = new TruckProducer();

    @Override
    public List getAll(Class type) {
        if (type.equals(Bulldozer.class)) {
            return new ArrayList<>(bulldozerProducer.get());
        } else if (type.equals(Excavator.class)) {
            return new ArrayList<>(excavatorProducer.get());
        } else if (type.equals(Truck.class)) {
            return new ArrayList<>(truckProducer.get());
        } else {
            return new ArrayList<>();
        }
    }

    @Override
    public void fill(List<? super M> machines, M value) {
        int sizeList = machines.size();
        for (int i = 0; i < sizeList; i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends M> machines) {
        for (M machine: machines) {
            machine.doWork();
        }
    }
}

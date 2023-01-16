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
    private static BulldozerProducer bulldozerProducer = new BulldozerProducer();
    private static ExcavatorProducer excavatorProducer = new ExcavatorProducer();
    private static TruckProducer truckProducer = new TruckProducer();

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type.equals(Bulldozer.class)) {
            return bulldozerProducer.get();
        } else if (type.equals(Excavator.class)) {
            return excavatorProducer.get();
        } else if (type.equals(Truck.class)) {
            return truckProducer.get();
        }
        return new ArrayList<>();
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }

    @Override
    public void fill(List<Object> machines, Object value) {

        machines.replaceAll(ignored -> value);
    }
}

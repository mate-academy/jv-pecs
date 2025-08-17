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
        List<? extends Machine> machines = getProducer(type).get();
        return new ArrayList<Machine>(machines);
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        machines.replaceAll(e -> e = value);
    }

    @Override
    public void startWorking(List<? extends Machine> list) {
        for (Machine obj : list) {
            obj.doWork();
        }
    }

    private MachineProducer<? extends Machine> getProducer(Class<? extends Machine> type) {
        if (Bulldozer.class.equals(type)) {
            return new BulldozerProducer();
        }
        if (Truck.class.equals(type)) {
            return new TruckProducer();
        }
        if (Excavator.class.equals(type)) {
            return new ExcavatorProducer();
        } else {
            return (MachineProducer<Machine>) () -> new ArrayList<>();
        }
    }

}

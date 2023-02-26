package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.Collections;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    private final BulldozerProducer bulldozerProducer;
    private final ExcavatorProducer excavatorProducer;
    private final TruckProducer truckProducer;

    public MachineServiceImpl() {
        this.bulldozerProducer = new BulldozerProducer();
        this.excavatorProducer = new ExcavatorProducer();
        this.truckProducer = new TruckProducer();
    }

    @Override
    public List getAll(Class<?> type) {
        if (type.equals(Bulldozer.class)) {
            return bulldozerProducer.get();
        }
        if (type.equals(Excavator.class)) {
            return excavatorProducer.get();
        }
        if (type.equals(Truck.class)) {
            return truckProducer.get();
        } else {
            return Collections.emptyList();
        }
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        Collections.fill(machines, value);
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}

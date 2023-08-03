package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.model.Workable;
import java.util.Collections;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    private final MachineProducer<Bulldozer> bulldozerProducer;
    private final MachineProducer<Excavator> excavatorProducer;
    private final MachineProducer<Truck> truckProducer;

    public MachineServiceImpl() {
        this.bulldozerProducer = new BulldozerProducer();
        this.excavatorProducer = new ExcavatorProducer();
        this.truckProducer = new TruckProducer();
    }

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        MachineProducer<? extends Machine> machineProducer = getProducer(type);
        return machineProducer == null ? Collections.emptyList()
                : (List<Machine>) machineProducer.get();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        Collections.fill(machines, value);
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        machines.forEach(Workable::doWork);
    }

    private MachineProducer<? extends Machine> getProducer(Class type) {
        if (type == Bulldozer.class) {
            return bulldozerProducer;
        } else if (type == Excavator.class) {
            return excavatorProducer;
        } else if (type == Truck.class) {
            return truckProducer;
        }
        return null;
    }
}

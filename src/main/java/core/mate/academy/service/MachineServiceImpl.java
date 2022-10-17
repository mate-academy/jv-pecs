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
    private BulldozerProducer bulldozerProducer = new BulldozerProducer();
    private ExcavatorProducer excavatorProducer = new ExcavatorProducer();
    private TruckProducer truckProducer = new TruckProducer();

    @Override
    public List<Machine> getAll(Class type) {
        if (type.equals(Bulldozer.class)) {
            List<Bulldozer> machines = bulldozerProducer.get();
            machines.add(new Bulldozer());
            return new ArrayList<>(machines);
        } else if (type.equals(Excavator.class)) {
            List<Excavator> machines = excavatorProducer.get();
            machines.add(new Excavator());
            return new ArrayList<>(machines);
        } else if (type.equals(Truck.class)) {
            List<Truck> machines = truckProducer.get();
            machines.add(new Truck());
            return new ArrayList<>(machines);
        }
        List<? extends Machine> machines = truckProducer.get();
        return new ArrayList<>(machines);
    }

    @Override
    public void startWorking(List<? extends Machine> list) {
        for (Machine machine : list) {
            machine.doWork();
        }
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }
}

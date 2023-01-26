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
public class MachineServiceImpl implements MachineService {
    private BulldozerProducer bulldozerProducer = new BulldozerProducer();
    private ExcavatorProducer excavatorProducer = new ExcavatorProducer();
    private TruckProducer truckProducer = new TruckProducer();

    @Override
    public List getAll(Class type) {
        if (type == Bulldozer.class) {
            List<Bulldozer> bulldozers = bulldozerProducer.get();
            return new ArrayList<>(bulldozers);
        }
        if (type == Excavator.class) {
            List<Excavator> excavators = excavatorProducer.get();
            return new ArrayList<>(excavators);
        }
        if (type == Truck.class) {
            List<Truck> trucks = truckProducer.get();
            return new ArrayList<>(trucks);
        }
        return new ArrayList();
    }

    @Override
    public void startWorking(List machines) {
        for (Object machine : machines) {
            Machine machine1 = (Machine) machine;
            machine1.doWork();
        }
    }

    @Override
    public void fill(List machines, Machine value) {
        int size = machines.size();
        for (int i = 0; i < size; i++) {
            machines.set(i, value);
        }
    }
}

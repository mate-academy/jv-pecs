package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;

import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService {

    @Override
    public List getAll(Class type) {
        if (type == Truck.class) {
            return new TruckProducer().get();
        } else if (type == Bulldozer.class) {
            return new BulldozerProducer().get();
        } else {
            return new ExcavatorProducer().get();
        }
    }

    @Override
    public void fill(List machines, Machine value) {

    }

    @Override
    public void startWorking(List machines) {

    }
}

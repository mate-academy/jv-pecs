package core.mate.academy.service;

import core.mate.academy.model.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService {
    @Override
    public List<? extends Machine> getAll(Class type) {
        if (type == Bulldozer.class) {
            BulldozerProducer bulldozerProducer = new BulldozerProducer();
            List<? extends Machine> machines = bulldozerProducer.get();
            return machines;
        }
        if (type == Excavator.class) {
            ExcavatorProducer excavatorProducer = new ExcavatorProducer();
            List<? extends Machine> machines = excavatorProducer.get();
            return machines;
        }
        if (type == Truck.class) {
            TruckProducer truckProducer = new TruckProducer();
            List<? extends Machine> machines = truckProducer.get();
            return machines;
        }
        return new ArrayList<>();
    }

    @Override
    public void fill(List machines, Object value) {
//        for (Machine machine: machines) {
//            machine = value;
//        }
    }

    @Override
    public void startWorking(List list) {
//        for (Machine machine: list) {
//            machine.doWork();
//        }
    }
}

//if (type == Bulldozer.class) {
//BulldozerProducer bulldozerProducer = new BulldozerProducer();
//return bulldozerProducer.get();
//}
//if (type == Excavator.class) {
//ExcavatorProducer excavatorProducer = new ExcavatorProducer();
//return excavatorProducer.get();
//}
//if (type == Truck.class) {
//TruckProducer truckProducer = new TruckProducer();
//return truckProducer.get();
//}
//return new ArrayList<>();

//for (Machine machine: list) {
//machine.doWork();
//}

//for (Machine machine: machines) {
//machine = value;z
//}
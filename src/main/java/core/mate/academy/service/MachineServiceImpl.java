package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.service.producers.BulldozerProducer;
import core.mate.academy.service.producers.ExcavatorProducer;
import core.mate.academy.service.producers.TruckProducer;

import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type == Bulldozer.class) {
            BulldozerProducer bulldozerProducer = new BulldozerProducer();
            bulldozerProducer.get();
        } else if (type == Excavator.class) {
            ExcavatorProducer excavatorProducer = new ExcavatorProducer();
            excavatorProducer.get();
        } else if (type == Truck.class) {
            TruckProducer truckProducer = new TruckProducer();
            truckProducer.get();
        }
        return null;
    }

    @Override
    public <T> void fill(List<T> machines, T value) {
        if (value.getClass() == Bulldozer.class
                || value.getClass() == Excavator.class
                || value.getClass() == Truck.class)
            machines.add(value);
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();


//            Class type = machine.getClass();
//            if(type == Bulldozer.class) {
//                Bulldozer bulldozer = (Bulldozer) machine;
//                bulldozer.doWork();
//            } else if(type == Excavator.class) {
//                Excavator excavator = (Excavator) machine;
//                excavator.doWork();
//            } else if (type == Truck.class) {
//                Truck truck = (Truck) machine;
//                truck.doWork();
//            }
        }
    }
}
